package com.intuit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INVESTMENT_TRANSACTION")
public class InvestmentTransactionVO extends TransactionVO {

    @Column(name = "reversalInstitutionTransactionId", nullable = true)
    private String reversalInstitutionTransactionId;
    
    @Column(name = "description", nullable = true)
    private String description;
    
    @Column(name = "buyType", nullable = true)
    private String buyType;
    
    @Column(name = "incomeType", nullable = true)
    private String incomeType;
    
    @Column(name = "inv401KSource", nullable = true)
    private String inv401KSource;
    
    @Column(name = "loanId", nullable = true)
    private String loanId;
    
    @Column(name = "optionsActionType", nullable = true)
    private String optionsActionType;
    
    @Column(name = "optionsBuyType", nullable = true)
    private String optionsBuyType;
    
    @Column(name = "optionsSellType", nullable = true)
    private String optionsSellType;
    
    @Column(name = "positionType", nullable = true)
    private String positionType;
    
    @Column(name = "relatedInstitutionTradeId", nullable = true)
    private String relatedInstitutionTradeId;
    
    @Column(name = "relatedOptionTransType", nullable = true)
    private String relatedOptionTransType;
    
    @Column(name = "securedType", nullable = true)
    private String securedType;
    
    @Column(name = "sellReason", nullable = true)
    private String sellReason;
    
    @Column(name = "sellType", nullable = true)
    private String sellType;
    
    @Column(name = "subaccountFromType", nullable = true)
    private String subaccountFromType;
    
    @Column(name = "subaccountFundType", nullable = true)
    private String subaccountFundType;
    
    @Column(name = "subaccountSecurityType", nullable = true)
    private String subaccountSecurityType;
    
    @Column(name = "subaccountToType", nullable = true)
    private String subaccountToType;
    
    @Column(name = "transferAction", nullable = true)
    private String transferAction;
    
    @Column(name = "unitType", nullable = true)
    private String unitType;
    
    @Column(name = "cusip", nullable = true)
    private String cusip;
    
    @Column(name = "symbol", nullable = true)
    private String symbol;
    
    @Column(name = "unitAction", nullable = true)
    private String unitAction;
    
    @Column(name = "optionsSecurity", nullable = true)
    private String optionsSecurity;
    
    @Column(name = "tradeDate", nullable = true)
    private Date tradeDate;
    
    @Column(name = "settleDate", nullable = true)
    private Date settleDate;
    
    @Column(name = "accruedInterestAmount", nullable = true)
    private Long accruedInterestAmount;
    
    @Column(name = "averageCostBasisAmount", nullable = true)
    private Long averageCostBasisAmount;
    
    @Column(name = "commissionAmount", nullable = true)
    private Long commissionAmount;
    
    @Column(name = "denominator", nullable = true)
    private Long denominator;
    
    @Column(name = "payrollDate", nullable = true)
    private Date payrollDate;
    
    @Column(name = "purchaseDate", nullable = true)
    private Date purchaseDate;
    
    @Column(name = "gainAmount", nullable = true)
    private Long gainAmount;
    
    @Column(name = "feesAmount", nullable = true)
    private Long feesAmount;
    
    @Column(name = "fractionalUnitsCashAmount", nullable = true)
    private Long fractionalUnitsCashAmount;
    
    @Column(name = "loadAmount", nullable = true)
    private Long loadAmount;
    
    @Column(name = "loanInterestAmount", nullable = true)
    private Long loanInterestAmount;
    
    @Column(name = "loanPrincipalAmount", nullable = true)
    private Long loanPrincipalAmount;
    
    @Column(name = "markdownAmount", nullable = true)
    private Long markdownAmount;
    
    @Column(name = "markupAmount", nullable = true)
    private Long markupAmount;
    
    @Column(name = "newUnits", nullable = true)
    private Long newUnits;
    
    @Column(name = "numerator", nullable = true)
    private Long numerator;
    
    @Column(name = "oldUnits", nullable = true)
    private Long oldUnits;
    
    @Column(name = "penaltyAmount", nullable = true)
    private Long penaltyAmount;
    
    @Column(name = "priorYearContribution", nullable = true)
    private boolean priorYearContribution;
    
    @Column(name = "sharesPerContract", nullable = true)
    private int sharesPerContract;
    
    @Column(name = "stateWithholding", nullable = true)
    private Long stateWithholding;
    
    @Column(name = "totalAmount", nullable = true)
    private Long totalAmount;
    
    @Column(name = "taxesAmount", nullable = true)
    private Long taxesAmount;
    
    @Column(name = "taxExempt", nullable = true)
    private boolean taxExempt;
    
    @Column(name = "unitPrice", nullable = true)
    private Long unitPrice;
    
    @Column(name = "units", nullable = true)
    private Long units;
    
    @Column(name = "withholdingAmount", nullable = true)
    private Long withholdingAmount;
    
    @Column(name = "optionsSharesPerContract", nullable = true)
    private Long optionsSharesPerContract;
    
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

    public String getReversalInstitutionTransactionId() {
        return reversalInstitutionTransactionId;
    }

    public void setReversalInstitutionTransactionId(String reversalInstitutionTransactionId) {
        this.reversalInstitutionTransactionId = reversalInstitutionTransactionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBuyType() {
        return buyType;
    }

    public void setBuyType(String buyType) {
        this.buyType = buyType;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public String getInv401KSource() {
        return inv401KSource;
    }

    public void setInv401KSource(String inv401kSource) {
        inv401KSource = inv401kSource;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getOptionsActionType() {
        return optionsActionType;
    }

    public void setOptionsActionType(String optionsActionType) {
        this.optionsActionType = optionsActionType;
    }

    public String getOptionsBuyType() {
        return optionsBuyType;
    }

    public void setOptionsBuyType(String optionsBuyType) {
        this.optionsBuyType = optionsBuyType;
    }

    public String getOptionsSellType() {
        return optionsSellType;
    }

    public void setOptionsSellType(String optionsSellType) {
        this.optionsSellType = optionsSellType;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getRelatedInstitutionTradeId() {
        return relatedInstitutionTradeId;
    }

    public void setRelatedInstitutionTradeId(String relatedInstitutionTradeId) {
        this.relatedInstitutionTradeId = relatedInstitutionTradeId;
    }

    public String getRelatedOptionTransType() {
        return relatedOptionTransType;
    }

    public void setRelatedOptionTransType(String relatedOptionTransType) {
        this.relatedOptionTransType = relatedOptionTransType;
    }

    public String getSecuredType() {
        return securedType;
    }

    public void setSecuredType(String securedType) {
        this.securedType = securedType;
    }

    public String getSellReason() {
        return sellReason;
    }

    public void setSellReason(String sellReason) {
        this.sellReason = sellReason;
    }

    public String getSellType() {
        return sellType;
    }

    public void setSellType(String sellType) {
        this.sellType = sellType;
    }

    public String getSubaccountFromType() {
        return subaccountFromType;
    }

    public void setSubaccountFromType(String subaccountFromType) {
        this.subaccountFromType = subaccountFromType;
    }

    public String getSubaccountFundType() {
        return subaccountFundType;
    }

    public void setSubaccountFundType(String subaccountFundType) {
        this.subaccountFundType = subaccountFundType;
    }

    public String getSubaccountSecurityType() {
        return subaccountSecurityType;
    }

    public void setSubaccountSecurityType(String subaccountSecurityType) {
        this.subaccountSecurityType = subaccountSecurityType;
    }

    public String getSubaccountToType() {
        return subaccountToType;
    }

    public void setSubaccountToType(String subaccountToType) {
        this.subaccountToType = subaccountToType;
    }

    public String getTransferAction() {
        return transferAction;
    }

    public void setTransferAction(String transferAction) {
        this.transferAction = transferAction;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getUnitAction() {
        return unitAction;
    }

    public void setUnitAction(String unitAction) {
        this.unitAction = unitAction;
    }

    public String getOptionsSecurity() {
        return optionsSecurity;
    }

    public void setOptionsSecurity(String optionsSecurity) {
        this.optionsSecurity = optionsSecurity;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    public Long getAccruedInterestAmount() {
        return accruedInterestAmount;
    }

    public void setAccruedInterestAmount(Long accruedInterestAmount) {
        this.accruedInterestAmount = accruedInterestAmount;
    }

    public Long getAverageCostBasisAmount() {
        return averageCostBasisAmount;
    }

    public void setAverageCostBasisAmount(Long averageCostBasisAmount) {
        this.averageCostBasisAmount = averageCostBasisAmount;
    }

    public Long getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Long commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Long getDenominator() {
        return denominator;
    }

    public void setDenominator(Long denominator) {
        this.denominator = denominator;
    }

    public Date getPayrollDate() {
        return payrollDate;
    }

    public void setPayrollDate(Date payrollDate) {
        this.payrollDate = payrollDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getGainAmount() {
        return gainAmount;
    }

    public void setGainAmount(Long gainAmount) {
        this.gainAmount = gainAmount;
    }

    public Long getFeesAmount() {
        return feesAmount;
    }

    public void setFeesAmount(Long feesAmount) {
        this.feesAmount = feesAmount;
    }

    public Long getFractionalUnitsCashAmount() {
        return fractionalUnitsCashAmount;
    }

    public void setFractionalUnitsCashAmount(Long fractionalUnitsCashAmount) {
        this.fractionalUnitsCashAmount = fractionalUnitsCashAmount;
    }

    public Long getLoadAmount() {
        return loadAmount;
    }

    public void setLoadAmount(Long loadAmount) {
        this.loadAmount = loadAmount;
    }

    public Long getLoanInterestAmount() {
        return loanInterestAmount;
    }

    public void setLoanInterestAmount(Long loanInterestAmount) {
        this.loanInterestAmount = loanInterestAmount;
    }

    public Long getLoanPrincipalAmount() {
        return loanPrincipalAmount;
    }

    public void setLoanPrincipalAmount(Long loanPrincipalAmount) {
        this.loanPrincipalAmount = loanPrincipalAmount;
    }

    public Long getMarkdownAmount() {
        return markdownAmount;
    }

    public void setMarkdownAmount(Long markdownAmount) {
        this.markdownAmount = markdownAmount;
    }

    public Long getMarkupAmount() {
        return markupAmount;
    }

    public void setMarkupAmount(Long markupAmount) {
        this.markupAmount = markupAmount;
    }

    public Long getNewUnits() {
        return newUnits;
    }

    public void setNewUnits(Long newUnits) {
        this.newUnits = newUnits;
    }

    public Long getNumerator() {
        return numerator;
    }

    public void setNumerator(Long numerator) {
        this.numerator = numerator;
    }

    public Long getOldUnits() {
        return oldUnits;
    }

    public void setOldUnits(Long oldUnits) {
        this.oldUnits = oldUnits;
    }

    public Long getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(Long penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public boolean isPriorYearContribution() {
        return priorYearContribution;
    }

    public void setPriorYearContribution(boolean priorYearContribution) {
        this.priorYearContribution = priorYearContribution;
    }

    public int getSharesPerContract() {
        return sharesPerContract;
    }

    public void setSharesPerContract(int sharesPerContract) {
        this.sharesPerContract = sharesPerContract;
    }

    public Long getStateWithholding() {
        return stateWithholding;
    }

    public void setStateWithholding(Long stateWithholding) {
        this.stateWithholding = stateWithholding;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getTaxesAmount() {
        return taxesAmount;
    }

    public void setTaxesAmount(Long taxesAmount) {
        this.taxesAmount = taxesAmount;
    }

    public boolean isTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getUnits() {
        return units;
    }

    public void setUnits(Long units) {
        this.units = units;
    }

    public Long getWithholdingAmount() {
        return withholdingAmount;
    }

    public void setWithholdingAmount(Long withholdingAmount) {
        this.withholdingAmount = withholdingAmount;
    }

    public Long getOptionsSharesPerContract() {
        return optionsSharesPerContract;
    }

    public void setOptionsSharesPerContract(Long optionsSharesPerContract) {
        this.optionsSharesPerContract = optionsSharesPerContract;
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
