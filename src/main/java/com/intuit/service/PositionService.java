package com.intuit.service;

import com.intuit.ipp.aggcat.data.InvestmentPosition;

import java.util.List;

public interface PositionService {

    List<InvestmentPosition> listAccountPositions(Long accountId);
    
}
