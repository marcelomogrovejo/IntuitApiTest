package com.intuit.controller;

import com.intuit.ipp.aggcat.data.TransactionList;
import com.intuit.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;
    
    @RequestMapping(value = "/find/{accountId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody TransactionList getTransactionFromAPI(@PathVariable String accountId) {
        return transactionService.listTransaction(Long.parseLong(accountId), "2013-01-01", "2015-01-01");
        //400165094462
    }
    
//    @RequestMapping(value = "/add/{accountId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody String addTransactionFromAPI(@PathVariable String accountId) {
//        String result = "Failure";
//        if(transactionService.addOne(Long.parseLong(accountId))) {
//            result = "Success";
//        }
//        return result;
//        //400165094462
//    }

}
