package com.intuit.service;

import com.intuit.ipp.aggcat.data.TransactionList;

public interface TransactionService {

    TransactionList listTransaction(Long accountId, String txnStartDate, String txnEndDate);
    
    boolean addOne(Long accountId, String txnStartDate, String txnEndDate);

}
