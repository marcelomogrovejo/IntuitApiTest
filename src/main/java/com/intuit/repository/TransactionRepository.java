package com.intuit.repository;

import com.intuit.entity.TransactionVO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionVO, Long> {

}
