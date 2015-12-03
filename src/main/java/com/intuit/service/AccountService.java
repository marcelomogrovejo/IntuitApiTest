package com.intuit.service;

import com.intuit.ipp.aggcat.data.Account;
import com.intuit.ipp.aggcat.data.InvestmentPosition;
import com.intuit.ipp.aggcat.data.TransactionList;

import java.util.List;

public interface AccountService {

    List<Account> getAccounts();
    
    Account findByNumber(String accountNumber);
    
    TransactionList listTransaction(Long accountId, String txnStartDate, String txnEndDate);
    
    List<InvestmentPosition> listAccountPositions(Long accountId);
    
}
