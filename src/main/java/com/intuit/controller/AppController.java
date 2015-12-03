package com.intuit.controller;

import com.intuit.entity.Institution;
import com.intuit.service.InstitutionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
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
	private InstitutionService institutionServiceImpl;
	
	@RequestMapping(value = "/db-institution", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Institution> listInstitutions() {
		return institutionServiceImpl.findAllInstitution();
	}
    
}
