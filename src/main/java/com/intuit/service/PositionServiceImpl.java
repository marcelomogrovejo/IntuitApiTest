package com.intuit.service;

import com.intuit.ipp.aggcat.data.InvestmentPosition;
import com.intuit.ipp.aggcat.data.InvestmentPositions;
import com.intuit.ipp.aggcat.exception.AggCatException;
import com.intuit.ipp.aggcat.service.AggCatService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PositionServiceImpl implements PositionService {

    private static final Logger LOG = LoggerFactory.getLogger(PositionServiceImpl.class);
    
    @Autowired
    private AggCatApiService aggCatApiService;
    
    public List<InvestmentPosition> listAccountPositions(Long accountId) {
        
        List<InvestmentPosition> positionList;
        
        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
            InvestmentPositions positions = aggCatService.getInvestmentPositions(accountId);
            positionList = positions.getPositions();

        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.",
                    ex);
        }
        
        return positionList;
    }

    
}
