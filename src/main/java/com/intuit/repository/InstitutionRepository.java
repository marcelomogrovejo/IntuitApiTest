package com.intuit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intuit.entity.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}
