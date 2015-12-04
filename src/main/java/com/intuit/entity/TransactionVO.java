package com.intuit.entity;

import com.intuit.ipp.aggcat.data.CurrencyCode;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "TRANSACTION")
public class TransactionVO {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "currencyType", nullable = true)
    private CurrencyCode currencyType;
    
    @Column(name = "institutionTransactionId", nullable = true)
    private String institutionTransactionId;
    
    @Column(name = "transactionCorrectedType", nullable = true)
    private String transactionCorrectedType;
    
    @Column(name = "serverTransactionId", nullable = true)
    private String serverTransactionId;
    
    @Column(name = "checkNumber", nullable = true)
    private String checkNumber;
    
    @Column(name = "refNumber", nullable = true)
    private String refNumber;
    
    @Column(name = "confirmationNumber", nullable = true)
    private String confirmationNumber;
    
    @Column(name = "payeeId", nullable = true)
    private String payeeId;
    
    @Column(name = "payeeName", nullable = true)
    private String payeeName;
    
    @Column(name = "extendedPayeeName", nullable = true)
    private String extendedPayeeName;
    
    @Column(name = "memo", nullable = true)
    private String memo;
    
    @Column(name = "type", nullable = true)
    private String type;
    
    @Column(name = "valueType", nullable = true)
    private String valueType;
    
    @Column(name = "currencyRate", nullable = true)
    private Long currencyRate;
    
    @Column(name = "originalCurrency", nullable = true)
    private boolean originalCurrency;
    
    @Column(name = "postedDate", nullable = true)
    private Date postedDate;
    
    @Column(name = "userDateprivate", nullable = true)
    private Date userDateprivate;
    
    @Column(name = "availableDate", nullable = true)
    private Date availableDate;
    
    @Column(name = "amount", nullable = true)
    private BigDecimal amount;
    
    @Column(name = "runningBalanceAmount", nullable = true)
    private Long runningBalanceAmount;
    
    @Column(name = "pending", nullable = true)
    private boolean pending;
    
    @Column(name = "categorization", nullable = true)
    private String categorization;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CurrencyCode getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyCode currencyType) {
        this.currencyType = currencyType;
    }

    public String getInstitutionTransactionId() {
        return institutionTransactionId;
    }

    public void setInstitutionTransactionId(String institutionTransactionId) {
        this.institutionTransactionId = institutionTransactionId;
    }

    public String getTransactionCorrectedType() {
        return transactionCorrectedType;
    }

    public void setTransactionCorrectedType(String transactionCorrectedType) {
        this.transactionCorrectedType = transactionCorrectedType;
    }

    public String getServerTransactionId() {
        return serverTransactionId;
    }

    public void setServerTransactionId(String serverTransactionId) {
        this.serverTransactionId = serverTransactionId;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getExtendedPayeeName() {
        return extendedPayeeName;
    }

    public void setExtendedPayeeName(String extendedPayeeName) {
        this.extendedPayeeName = extendedPayeeName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public Long getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Long currencyRate) {
        this.currencyRate = currencyRate;
    }

    public boolean isOriginalCurrency() {
        return originalCurrency;
    }

    public void setOriginalCurrency(boolean originalCurrency) {
        this.originalCurrency = originalCurrency;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public Date getUserDateprivate() {
        return userDateprivate;
    }

    public void setUserDateprivate(Date userDateprivate) {
        this.userDateprivate = userDateprivate;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getRunningBalanceAmount() {
        return runningBalanceAmount;
    }

    public void setRunningBalanceAmount(Long runningBalanceAmount) {
        this.runningBalanceAmount = runningBalanceAmount;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public String getCategorization() {
        return categorization;
    }

    public void setCategorization(String categorization) {
        this.categorization = categorization;
    }

}
