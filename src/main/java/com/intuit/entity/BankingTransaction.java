package com.intuit.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BANKING_TRANSACTION")
public class BankingTransaction extends Transaction {
    
}
