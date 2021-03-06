package com.intuit.controller;

import com.intuit.entity.InstitutionVO;
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
@RequestMapping("/api/institution")
public class InstitutionController {

    @Autowired
    @Qualifier("apiService")
    private InstitutionService institutionServiceApiImpl;

    @Autowired
    @Qualifier("dbService")
    private InstitutionService institutionServiceImpl;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<InstitutionVO> listInstitutionsFromAPI() {
        return institutionServiceApiImpl.findAllInstitution();
        // 100000
    }

    @RequestMapping(value = "/add/{institutionId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String addInstitutionFromAPI(@PathVariable String institutionId) {
        
        String result = "Failure";

        if(institutionServiceApiImpl.addOne(Long.parseLong(institutionId))) {
            result = "Success";
        }
        
        return result;
    }
    
    @RequestMapping(value = "/db-institution", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<InstitutionVO> listInstitutions() {
        return institutionServiceImpl.findAllInstitution();
    }
    
}
