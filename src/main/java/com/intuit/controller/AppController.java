package com.intuit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.entity.Institution;
import com.intuit.service.InstitutionService;

@RestController
@RequestMapping("/institutions")
public class AppController {

	@Autowired
	InstitutionService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Institution> listInstitutions() {
		return service.findAllInstitution();
	}
}
