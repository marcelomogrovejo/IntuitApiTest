package com.intuit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LOAN_TRANSACTION")
public class LoanTransaction extends Transaction {

    @Column(name = "principalAmount", nullable = true)
    private Long principalAmount;
    
    @Column(name = "interestAmount", nullable = true)
    private Long interestAmount;
    
    @Column(name = "escrowTotalAmount", nullable = true)
    private Long escrowTotalAmount;
    
    @Column(name = "escrowTaxAmount", nullable = true)
    private Long escrowTaxAmount;
    
    @Column(name = "escrowInsuranceAmount", nullable = true)
    private Long escrowInsuranceAmount;
    
    @Column(name = "escrowPmiAmount", nullable = true)
    private Long escrowPmiAmount;
    
    @Column(name = "escrowFeesAmount", nullable = true)
    private Long escrowFeesAmount;
    
    @Column(name = "escrowOtherAmount", nullable = true)
    private Long escrowOtherAmount;

    public Long getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(Long principalAmount) {
        this.principalAmount = principalAmount;
    }

    public Long getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Long interestAmount) {
        this.interestAmount = interestAmount;
    }

    public Long getEscrowTotalAmount() {
        return escrowTotalAmount;
    }

    public void setEscrowTotalAmount(Long escrowTotalAmount) {
        this.escrowTotalAmount = escrowTotalAmount;
    }

    public Long getEscrowTaxAmount() {
        return escrowTaxAmount;
    }

    public void setEscrowTaxAmount(Long escrowTaxAmount) {
        this.escrowTaxAmount = escrowTaxAmount;
    }

    public Long getEscrowInsuranceAmount() {
        return escrowInsuranceAmount;
    }

    public void setEscrowInsuranceAmount(Long escrowInsuranceAmount) {
        this.escrowInsuranceAmount = escrowInsuranceAmount;
    }

    public Long getEscrowPmiAmount() {
        return escrowPmiAmount;
    }

    public void setEscrowPmiAmount(Long escrowPmiAmount) {
        this.escrowPmiAmount = escrowPmiAmount;
    }

    public Long getEscrowFeesAmount() {
        return escrowFeesAmount;
    }

    public void setEscrowFeesAmount(Long escrowFeesAmount) {
        this.escrowFeesAmount = escrowFeesAmount;
    }

    public Long getEscrowOtherAmount() {
        return escrowOtherAmount;
    }

    public void setEscrowOtherAmount(Long escrowOtherAmount) {
        this.escrowOtherAmount = escrowOtherAmount;
    } 

}
