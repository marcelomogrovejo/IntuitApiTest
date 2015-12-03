package com.intuit.service;

import com.intuit.ipp.aggcat.data.TransactionList;
import com.intuit.ipp.aggcat.exception.AggCatException;
import com.intuit.ipp.aggcat.service.AggCatService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionServiceImpl implements TransactionService {

    private static final Logger LOG = LoggerFactory.getLogger(AccountServiceApiImpl.class);
    
    @Autowired
    AggCatApiService aggCatApiService;
    
    public TransactionList listTransaction(Long accountId, String txnStartDate, String txnEndDate) {
        
        TransactionList transactions;
        
        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
            transactions = aggCatService.getAccountTransactions(accountId, txnStartDate, txnEndDate);
            

        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.",
                    ex);
        }
        
        return transactions;
    }
    
}
