package com.intuit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "accountNumber", nullable = false)
	private String accountNumber;
	
	@Column(name = "accountNumberReal")
	private String accountNumberReal;
	
	@Column(name = "accountNickname")
	private String accountNickname;
	
	@Column(name = "displayPosition")
	private int displayPosition;
	
	@Column(name = "institutionId")
	private Long institutionId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "registeredUserName")
	private String registeredUserName;
	
	@Column(name = "balanceAmount")
	private String balanceAmount;
	
	@Column(name = "balanceDate")
	private int balanceDate;
	
	@Column(name = "balancePreviousAmount")
	private String balancePreviousAmount;
	
	@Column(name = "lastTxnDate")
	private int lastTxnDate;
	
	@Column(name = "aggrSuccessDate")
	private int aggrSuccessDate;
	
	@Column(name = "aggrAttemptDate")
	private int aggrAttemptDate;
	
	@Column(name = "aggrStatusCode")
	private String aggrStatusCode;
	
	@Column(name = "currencyCode")
	private String currencyCode;
	
	@Column(name = "bankId")
	private int bankId;
	
	@Column(name = "institutionLoginId")
	private int institutionLoginId;
	
	@Column(name = "creditAccountType")
	private String creditAccountType;
	
	@Column(name = "detailedDescription")
	private String detailedDescription;
	
	@Column(name = "interestRate")
	private String interestRate;
	
	@Column(name = "creditAvailableAmount")
	private String creditAvailableAmount;
	
	@Column(name = "creditMaxAmount")
	private String creditMaxAmount;
	
	@Column(name = "cashAdvanceAvailableAmount")
	private String cashAdvanceAvailableAmount;
	
	@Column(name = "cashAdvanceMaxAmount")
	private String cashAdvanceMaxAmount;
	
	@Column(name = "cashAdvanceBalance")
	private String cashAdvanceBalance;
	
	@Column(name = "cashAdvanceInterestRate")
	private String cashAdvanceInterestRate;
	
	@Column(name = "currentBalance")
	private String currentBalance;
	
	@Column(name = "paymentMinAmount")
	private String paymentMinAmount;
	
	@Column(name = "paymentDueDate")
	private int paymentDueDate;
	
	@Column(name = "previousBalance")
	private String previousBalance;
	
	@Column(name = "statementEndDate")
	private int statementEndDate;
	
	@Column(name = "statementPurchaseAmount")
	private String statementPurchaseAmount;
	
	@Column(name = "statementFinanceAmount")
	private String statementFinanceAmount;
	
	@Column(name = "pastDueAmount")
	private String pastDueAmount;
	
	@Column(name = "lastPaymentAmount")
	private String lastPaymentAmount;
	
	@Column(name = "lastPaymentDate")
	private int lastPaymentDate;
	
	@Column(name = "statementCloseBalance")
	private String statementCloseBalance;
	
	@Column(name = "statementLateFeeAmount")
	private String statementLateFeeAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumberReal() {
        return accountNumberReal;
    }

    public void setAccountNumberReal(String accountNumberReal) {
        this.accountNumberReal = accountNumberReal;
    }

    public String getAccountNickname() {
        return accountNickname;
    }

    public void setAccountNickname(String accountNickname) {
        this.accountNickname = accountNickname;
    }

    public int getDisplayPosition() {
        return displayPosition;
    }

    public void setDisplayPosition(int displayPosition) {
        this.displayPosition = displayPosition;
    }

    public Long getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Long institutionId) {
        this.institutionId = institutionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegisteredUserName() {
        return registeredUserName;
    }

    public void setRegisteredUserName(String registeredUserName) {
        this.registeredUserName = registeredUserName;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public int getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(int balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getBalancePreviousAmount() {
        return balancePreviousAmount;
    }

    public void setBalancePreviousAmount(String balancePreviousAmount) {
        this.balancePreviousAmount = balancePreviousAmount;
    }

    public int getLastTxnDate() {
        return lastTxnDate;
    }

    public void setLastTxnDate(int lastTxnDate) {
        this.lastTxnDate = lastTxnDate;
    }

    public int getAggrSuccessDate() {
        return aggrSuccessDate;
    }

    public void setAggrSuccessDate(int aggrSuccessDate) {
        this.aggrSuccessDate = aggrSuccessDate;
    }

    public int getAggrAttemptDate() {
        return aggrAttemptDate;
    }

    public void setAggrAttemptDate(int aggrAttemptDate) {
        this.aggrAttemptDate = aggrAttemptDate;
    }

    public String getAggrStatusCode() {
        return aggrStatusCode;
    }

    public void setAggrStatusCode(String aggrStatusCode) {
        this.aggrStatusCode = aggrStatusCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getInstitutionLoginId() {
        return institutionLoginId;
    }

    public void setInstitutionLoginId(int institutionLoginId) {
        this.institutionLoginId = institutionLoginId;
    }

    public String getCreditAccountType() {
        return creditAccountType;
    }

    public void setCreditAccountType(String creditAccountType) {
        this.creditAccountType = creditAccountType;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getCreditAvailableAmount() {
        return creditAvailableAmount;
    }

    public void setCreditAvailableAmount(String creditAvailableAmount) {
        this.creditAvailableAmount = creditAvailableAmount;
    }

    public String getCreditMaxAmount() {
        return creditMaxAmount;
    }

    public void setCreditMaxAmount(String creditMaxAmount) {
        this.creditMaxAmount = creditMaxAmount;
    }

    public String getCashAdvanceAvailableAmount() {
        return cashAdvanceAvailableAmount;
    }

    public void setCashAdvanceAvailableAmount(String cashAdvanceAvailableAmount) {
        this.cashAdvanceAvailableAmount = cashAdvanceAvailableAmount;
    }

    public String getCashAdvanceMaxAmount() {
        return cashAdvanceMaxAmount;
    }

    public void setCashAdvanceMaxAmount(String cashAdvanceMaxAmount) {
        this.cashAdvanceMaxAmount = cashAdvanceMaxAmount;
    }

    public String getCashAdvanceBalance() {
        return cashAdvanceBalance;
    }

    public void setCashAdvanceBalance(String cashAdvanceBalance) {
        this.cashAdvanceBalance = cashAdvanceBalance;
    }

    public String getCashAdvanceInterestRate() {
        return cashAdvanceInterestRate;
    }

    public void setCashAdvanceInterestRate(String cashAdvanceInterestRate) {
        this.cashAdvanceInterestRate = cashAdvanceInterestRate;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getPaymentMinAmount() {
        return paymentMinAmount;
    }

    public void setPaymentMinAmount(String paymentMinAmount) {
        this.paymentMinAmount = paymentMinAmount;
    }

    public int getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(int paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public String getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(String previousBalance) {
        this.previousBalance = previousBalance;
    }

    public int getStatementEndDate() {
        return statementEndDate;
    }

    public void setStatementEndDate(int statementEndDate) {
        this.statementEndDate = statementEndDate;
    }

    public String getStatementPurchaseAmount() {
        return statementPurchaseAmount;
    }

    public void setStatementPurchaseAmount(String statementPurchaseAmount) {
        this.statementPurchaseAmount = statementPurchaseAmount;
    }

    public String getStatementFinanceAmount() {
        return statementFinanceAmount;
    }

    public void setStatementFinanceAmount(String statementFinanceAmount) {
        this.statementFinanceAmount = statementFinanceAmount;
    }

    public String getPastDueAmount() {
        return pastDueAmount;
    }

    public void setPastDueAmount(String pastDueAmount) {
        this.pastDueAmount = pastDueAmount;
    }

    public String getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    public void setLastPaymentAmount(String lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
    }

    public int getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(int lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public String getStatementCloseBalance() {
        return statementCloseBalance;
    }

    public void setStatementCloseBalance(String statementCloseBalance) {
        this.statementCloseBalance = statementCloseBalance;
    }

    public String getStatementLateFeeAmount() {
        return statementLateFeeAmount;
    }

    public void setStatementLateFeeAmount(String statementLateFeeAmount) {
        this.statementLateFeeAmount = statementLateFeeAmount;
    }

}
