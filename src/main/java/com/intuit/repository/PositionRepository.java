package com.intuit.repository;

import com.intuit.entity.InvestmentPositionVO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<InvestmentPositionVO, Long> {

}
