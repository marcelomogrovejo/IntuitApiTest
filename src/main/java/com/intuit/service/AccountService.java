package com.intuit.service;

import com.intuit.entity.AccountVO;
import com.intuit.ipp.aggcat.data.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAccounts();
    
    Account findByNumber(String accountNumber);

    boolean addOne(Long id);

    List<AccountVO> findAllAccounts();
}
