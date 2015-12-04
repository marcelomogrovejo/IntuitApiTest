package com.intuit.repository;

import com.intuit.entity.AccountVO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountVO, Long> {

}
