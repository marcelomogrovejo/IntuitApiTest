package com.intuit.service;

import java.util.List;

import com.intuit.entity.Institution;

public interface InstitutionService {

	Institution findById(Long id);
	
	List<Institution> findAllInstitution();
	
	boolean addOne(Long id);
}
