package com.intuit.service;

import com.intuit.ipp.aggcat.data.Account;
import com.intuit.ipp.aggcat.data.AccountList;
import com.intuit.ipp.aggcat.data.InvestmentPosition;
import com.intuit.ipp.aggcat.data.InvestmentPositions;
import com.intuit.ipp.aggcat.data.TransactionList;
import com.intuit.ipp.aggcat.exception.AggCatException;
import com.intuit.ipp.aggcat.service.AggCatService;
import com.intuit.repository.AccountRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountServiceApiImpl implements AccountService {

    private static final Logger LOG = LoggerFactory.getLogger(AccountServiceApiImpl.class);
    
    @Autowired
    AggCatApiService aggCatApiService;
    
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAccounts() {
        
        List<Account> accountList;
        
        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
            AccountList accounts = aggCatService.getCustomerAccounts();
            accountList = accounts.getBankingAccountsAndCreditAccountsAndLoanAccounts();
            
        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.",
                    ex);
        }

        return accountList;
    }
 
    public Account findByNumber(String accountNumber) {
        
        Account account = null;
        
        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
            AccountList accounts = aggCatService.getCustomerAccounts();
            List<Account> accountList = accounts.getBankingAccountsAndCreditAccountsAndLoanAccounts();

            for (Account a : accountList) {
                if(accountNumber.equals(a.getAccountNumber())) {
                    account = a;
                    
                    com.intuit.entity.Account newAccount = new com.intuit.entity.Account();
                    newAccount.setId(a.getAccountId());
                    newAccount.setAccountNumber(a.getAccountNumber());
                    newAccount.setInstitutionId(a.getInstitutionId());
                    newAccount.setStatus(a.getStatus());
                    
                    accountRepository.save(newAccount);
                }
            }

        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.",
                    ex);
        }
        
        return account;
    }

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