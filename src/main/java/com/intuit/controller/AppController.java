package com.intuit.controller;

import com.intuit.entity.Institution;
import com.intuit.ipp.aggcat.data.Account;
import com.intuit.ipp.aggcat.data.InvestmentPosition;
import com.intuit.ipp.aggcat.data.TransactionList;
import com.intuit.service.AccountService;
import com.intuit.service.InstitutionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	@Qualifier("dbService")
	InstitutionService institutionServiceImpl;
	
	@Autowired
	@Qualifier("apiService")
	InstitutionService institutionServiceApiImpl;
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/db-institution", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Institution> listInstitutions() {
		return institutionServiceImpl.findAllInstitution();
	}
	
	@RequestMapping(value = "/institution", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Institution> listInstitutionsFromAPI() {
        return institutionServiceApiImpl.findAllInstitution();
    }
	
	@RequestMapping(value = "/institution/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Institution getInstitutionFromAPI(@PathVariable String id) {
        return institutionServiceApiImpl.findById(Long.parseLong(id));
        //100000
    }
	
    @RequestMapping(value = "/account", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Account> listAccountFromAPI() {
        return accountService.getAccounts();
    }

    @RequestMapping(value = "/account/{accountNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Account getAccountFromAPI(@PathVariable String accountNumber) {
        return accountService.findByNumber(accountNumber);
        //8000006666
    }

    @RequestMapping(value = "/transaction/{accountId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody TransactionList getTransactionFromAPI(@PathVariable String accountId) {
        return accountService.listTransaction(Long.parseLong(accountId), "2013-01-01", "2015-01-01");
        //400165094462
    }

    @RequestMapping(value = "/position/{accountId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<InvestmentPosition> listAccountPositionsFromAPI(@PathVariable String accountId) {
        return accountService.listAccountPositions(Long.parseLong(accountId));
        //400165094462
    }
    
}
