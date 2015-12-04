package com.intuit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intuit.entity.InstitutionVO;

public interface InstitutionRepository extends JpaRepository<InstitutionVO, Long> {

}
