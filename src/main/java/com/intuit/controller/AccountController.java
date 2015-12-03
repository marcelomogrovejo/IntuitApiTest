package com.intuit.controller;

import com.intuit.ipp.aggcat.data.Account;
import com.intuit.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    AccountService accountService;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Account> listAccountFromAPI() {
        return accountService.getAccounts();
    }

    @RequestMapping(value = "/find/{accountNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Account getAccountFromAPI(@PathVariable String accountNumber) {
        return accountService.findByNumber(accountNumber);
        //8000006666
    }

    @RequestMapping(value = "/add/{accountId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String addAccountFromAPI(@PathVariable String accountId) {
        String result = "Failure";
        if(accountService.addOne(Long.parseLong(accountId))) {
            result = "Success";
        }
        return result;
        //400165094462
    }

}
