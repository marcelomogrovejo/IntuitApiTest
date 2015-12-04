package com.intuit.controller;

import com.intuit.ipp.aggcat.data.InvestmentPosition;
import com.intuit.service.PositionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/position")
public class PositionController {

    @Autowired
    private PositionService positionService;
    
    @RequestMapping(value = "/list/{accountId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<InvestmentPosition> listAccountPositionsFromAPI(@PathVariable String accountId) {
        return positionService.listAccountPositions(Long.parseLong(accountId));
        //400165094463
    }
    
    @RequestMapping(value = "/add/{accountId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String addPositionFromAPI(@PathVariable String accountId) {
        String result = "Failure";
        if(positionService.addOne(Long.parseLong(accountId))) {
            result = "Success";
        }
        return result;
        //400165094463
    }

}
