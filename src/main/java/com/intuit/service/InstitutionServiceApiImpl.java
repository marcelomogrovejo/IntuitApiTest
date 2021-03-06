package com.intuit.service;

import com.intuit.entity.InstitutionVO;
import com.intuit.ipp.aggcat.data.InstitutionDetail;
import com.intuit.ipp.aggcat.data.Institutions;
import com.intuit.ipp.aggcat.exception.AggCatException;
import com.intuit.ipp.aggcat.service.AggCatService;
import com.intuit.repository.InstitutionRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("apiService")
public class InstitutionServiceApiImpl implements InstitutionService {

    private static final Logger LOG = LoggerFactory.getLogger(InstitutionServiceImpl.class);
    
    @Autowired
    private AggCatApiService aggCatApiService;
    
    @Autowired
    private InstitutionRepository institutionRepository;
    
    @Override
    public InstitutionVO findById(Long id) {
        
        InstitutionVO result = new InstitutionVO();
        
        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
            InstitutionDetail institutionDetail = aggCatService.getInstitutionDetails(id);
            
            result.setId(institutionDetail.getInstitutionId());
            result.setInstitutionName(institutionDetail.getInstitutionName());
            
        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.",
                    ex);
        }
        
        return result;
    }

    @Override
    public List<InstitutionVO> findAllInstitution() {
        
        List<com.intuit.ipp.aggcat.data.Institution> institutions;
        List<InstitutionVO> institutionsResult = new ArrayList<>();
        
        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
            Institutions apiInstitutions = aggCatService.getInstitutions();
            institutions = apiInstitutions.getInstitutions();            
        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.",
                    ex);
        }
        
        for(com.intuit.ipp.aggcat.data.Institution i: institutions) {
            InstitutionVO inst = new InstitutionVO();
            inst.setId(i.getInstitutionId());
            inst.setInstitutionName(i.getInstitutionName());
            institutionsResult.add(inst);
        }
        
        return institutionsResult;
    }

    @Override
    public boolean addOne(Long id) {

        InstitutionVO result = new InstitutionVO();
        
        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
            InstitutionDetail institutionDetail = aggCatService.getInstitutionDetails(id);
            
            result.setId(institutionDetail.getInstitutionId());
            result.setInstitutionName(institutionDetail.getInstitutionName());
            result.setHomeUrl(institutionDetail.getEmailAddress());
            result.setPhoneNumber(institutionDetail.getPhoneNumber());
            
            institutionRepository.save(result);
            
        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.",
                    ex);
        }
        
        return true;

    }

}
