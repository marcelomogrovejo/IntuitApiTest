package com.intuit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVESTMENT_POSITION")
public class InvestmentPosition {
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "changePercent", nullable = true)
    private Long changePercent;
    
    @Column(name = "costBasis", nullable = true)
    private Long costBasis;
    
    @Column(name = "currencyCode", nullable = true)
    private String currencyCode;
    
    @Column(name = "currencyRate", nullable = true)
    private Long currencyRate;
    
    @Column(name = "currencyType", nullable = true)
    private String currencyType;
    
    @Column(name = "unitPrice", nullable = true)
    private Long unitPrice;
    
    @Column(name = "priceAsOfDate", nullable = true)
    private Date priceAsOfDate;
    
    @Column(name = "cusip", nullable = true)
    private String cusip;
    
    @Column(name = "dailyChange", nullable = true)
    private Long dailyChange;
    
    @Column(name = "memo", nullable = true)
    private String memo;
    
    @Column(name = "empPretaxContribAmount", nullable = true)
    private Long empPretaxContribAmount;
    
    @Column(name = "empMatchAmount", nullable = true)
    private Long empMatchAmount;
    
    @Column(name = "heldInAccount", nullable = true)
    private String heldInAccount;
    
    @Column(name = "holdType", nullable = true)
    private String holdType;
    
    @Column(name = "investmentAllocation", nullable = true)
    private String investmentAllocation;
    
    @Column(name = "investmentDirection", nullable = true)
    private String investmentDirection;
    
    @Column(name = "paidPrice", nullable = true)
    private Long paidPrice;
    
    @Column(name = "marketValue", nullable = true)
    private Long marketValue;
    
    @Column(name = "maturityValue", nullable = true)
    private Long maturityValue;
    
    @Column(name = "units", nullable = true)
    private Long units;
    
    @Column(name = "unitUserQuantity", nullable = true)
    private Long unitUserQuantity;
    
    @Column(name = "unitStreetQuantity", nullable = true)
    private Long unitStreetQuantity;
    
    @Column(name = "positionType", nullable = true)
    private String positionType;
    
    @Column(name = "positionStatus", nullable = true)
    private String positionStatus;
    
    @Column(name = "secured", nullable = true)
    private String secured;
    
    @Column(name = "inv401KSource", nullable = true)
    private String inv401KSource;
    
    @Column(name = "reinvestmentCapGains", nullable = true)
    private boolean reinvestmentCapGains;
    
    @Column(name = "reinvestmentDividend", nullable = true)
    private boolean reinvestmentDividend;
    
    @Column(name = "transactionType", nullable = true)
    private String transactionType;
    
    @Column(name = "invSecurityType", nullable = true)
    private String invSecurityType;
    
    @Column(name = "otherInfo", nullable = true)
    private String otherInfo;
    
    @Column(name = "optionInfo", nullable = true)
    private String optionInfo;
    
    @Column(name = "stockInfo", nullable = true)
    private String stockInfo;
    
    @Column(name = "mfInfo", nullable = true)
    private String mfInfo;
    
    @Column(name = "debtInfo", nullable = true)
    private String debtInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(Long changePercent) {
        this.changePercent = changePercent;
    }

    public Long getCostBasis() {
        return costBasis;
    }

    public void setCostBasis(Long costBasis) {
        this.costBasis = costBasis;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Long getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Long currencyRate) {
        this.currencyRate = currencyRate;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getPriceAsOfDate() {
        return priceAsOfDate;
    }

    public void setPriceAsOfDate(Date priceAsOfDate) {
        this.priceAsOfDate = priceAsOfDate;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public Long getDailyChange() {
        return dailyChange;
    }

    public void setDailyChange(Long dailyChange) {
        this.dailyChange = dailyChange;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getEmpPretaxContribAmount() {
        return empPretaxContribAmount;
    }

    public void setEmpPretaxContribAmount(Long empPretaxContribAmount) {
        this.empPretaxContribAmount = empPretaxContribAmount;
    }

    public Long getEmpMatchAmount() {
        return empMatchAmount;
    }

    public void setEmpMatchAmount(Long empMatchAmount) {
        this.empMatchAmount = empMatchAmount;
    }

    public String getHeldInAccount() {
        return heldInAccount;
    }

    public void setHeldInAccount(String heldInAccount) {
        this.heldInAccount = heldInAccount;
    }

    public String getHoldType() {
        return holdType;
    }

    public void setHoldType(String holdType) {
        this.holdType = holdType;
    }

    public String getInvestmentAllocation() {
        return investmentAllocation;
    }

    public void setInvestmentAllocation(String investmentAllocation) {
        this.investmentAllocation = investmentAllocation;
    }

    public String getInvestmentDirection() {
        return investmentDirection;
    }

    public void setInvestmentDirection(String investmentDirection) {
        this.investmentDirection = investmentDirection;
    }

    public Long getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(Long paidPrice) {
        this.paidPrice = paidPrice;
    }

    public Long getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Long marketValue) {
        this.marketValue = marketValue;
    }

    public Long getMaturityValue() {
        return maturityValue;
    }

    public void setMaturityValue(Long maturityValue) {
        this.maturityValue = maturityValue;
    }

    public Long getUnits() {
        return units;
    }

    public void setUnits(Long units) {
        this.units = units;
    }

    public Long getUnitUserQuantity() {
        return unitUserQuantity;
    }

    public void setUnitUserQuantity(Long unitUserQuantity) {
        this.unitUserQuantity = unitUserQuantity;
    }

    public Long getUnitStreetQuantity() {
        return unitStreetQuantity;
    }

    public void setUnitStreetQuantity(Long unitStreetQuantity) {
        this.unitStreetQuantity = unitStreetQuantity;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(String positionStatus) {
        this.positionStatus = positionStatus;
    }

    public String getSecured() {
        return secured;
    }

    public void setSecured(String secured) {
        this.secured = secured;
    }

    public String getInv401KSource() {
        return inv401KSource;
    }

    public void setInv401KSource(String inv401kSource) {
        inv401KSource = inv401kSource;
    }

    public boolean isReinvestmentCapGains() {
        return reinvestmentCapGains;
    }

    public void setReinvestmentCapGains(boolean reinvestmentCapGains) {
        this.reinvestmentCapGains = reinvestmentCapGains;
    }

    public boolean isReinvestmentDividend() {
        return reinvestmentDividend;
    }

    public void setReinvestmentDividend(boolean reinvestmentDividend) {
        this.reinvestmentDividend = reinvestmentDividend;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getInvSecurityType() {
        return invSecurityType;
    }

    public void setInvSecurityType(String invSecurityType) {
        this.invSecurityType = invSecurityType;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getOptionInfo() {
        return optionInfo;
    }

    public void setOptionInfo(String optionInfo) {
        this.optionInfo = optionInfo;
    }

    public String getStockInfo() {
        return stockInfo;
    }

    public void setStockInfo(String stockInfo) {
        this.stockInfo = stockInfo;
    }

    public String getMfInfo() {
        return mfInfo;
    }

    public void setMfInfo(String mfInfo) {
        this.mfInfo = mfInfo;
    }

    public String getDebtInfo() {
        return debtInfo;
    }

    public void setDebtInfo(String debtInfo) {
        this.debtInfo = debtInfo;
    }

}
