package com.intuit.service;

import com.intuit.entity.CreditCardTransactionVO;
import com.intuit.ipp.aggcat.data.CreditCardTransaction;
import com.intuit.ipp.aggcat.data.TransactionList;
import com.intuit.ipp.aggcat.exception.AggCatException;
import com.intuit.ipp.aggcat.service.AggCatService;
import com.intuit.repository.TransactionRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionServiceImpl implements TransactionService {

    private static final Logger LOG = LoggerFactory.getLogger(AccountServiceApiImpl.class);

    @Autowired
    private AggCatApiService aggCatApiService;
    
    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionList listTransaction(Long accountId, String txnStartDate, String txnEndDate) {

        TransactionList transactions;

        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
            transactions = aggCatService.getAccountTransactions(accountId, txnStartDate, txnEndDate);


        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.", ex);
        }

        return transactions;
    }

    @Override
    public boolean addOne(Long accountId, String txnStartDate, String txnEndDate) {

        try {
            AggCatService aggCatService = aggCatApiService.getAggCatService();
//            List<BankingTransaction> bankingTransactions = aggCatService.getAccountTransactions(accountId, txnStartDate, txnEndDate).getBankingTransactions();
            List<CreditCardTransaction> creditTransactions =
                    aggCatService.getAccountTransactions(accountId, txnStartDate, txnEndDate).getCreditCardTransactions();
//            List<InvestmentBankingTransaction> invBankingTransactions =
//                    aggCatService.getAccountTransactions(accountId, txnStartDate, txnEndDate).getInvestmentBankingTransactions();
//            List<InvestmentTransaction> investmentTransactions =
//                    aggCatService.getAccountTransactions(accountId, txnStartDate, txnEndDate).getInvestmentTransactions();
//            List<LoanTransaction> loanTransactions = aggCatService.getAccountTransactions(accountId, txnStartDate, txnEndDate).getLoanTransactions();
//            List<RewardsTransaction> rewardsTransactions = aggCatService.getAccountTransactions(accountId, txnStartDate, txnEndDate).getRewardsTransactions();

            for (CreditCardTransaction ct : creditTransactions) {
                CreditCardTransactionVO creditTransaction = new CreditCardTransactionVO();
                creditTransaction.setId(ct.getId());
                creditTransaction.setCurrencyType(ct.getCurrencyType());
                creditTransaction.setPayeeName(ct.getPayeeName());
                creditTransaction.setAmount(ct.getAmount());
                
                transactionRepository.save(creditTransaction);
            }

        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new RuntimeException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.", ex);
        }

        return true;
    }
    
    

}
