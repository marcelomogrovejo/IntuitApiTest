package com.intuit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INVESTMENT_BANKING_TRANSACTION")
public class InvestmentBankingTransactionVO extends TransactionVO {
    
    @Column(name = "bankingTransactionType", nullable = true)
    private String bankingTransactionType;
    
    @Column(name = "subaccountFundType", nullable = true)
    private String subaccountFundType;
    
    @Column(name = "banking401KSourceType", nullable = true)
    private String banking401KSourceType;

    public String getBankingTransactionType() {
        return bankingTransactionType;
    }

    public void setBankingTransactionType(String bankingTransactionType) {
        this.bankingTransactionType = bankingTransactionType;
    }

    public String getSubaccountFundType() {
        return subaccountFundType;
    }

    public void setSubaccountFundType(String subaccountFundType) {
        this.subaccountFundType = subaccountFundType;
    }

    public String getBanking401KSourceType() {
        return banking401KSourceType;
    }

    public void setBanking401KSourceType(String banking401kSourceType) {
        banking401KSourceType = banking401kSourceType;
    }
    
}
