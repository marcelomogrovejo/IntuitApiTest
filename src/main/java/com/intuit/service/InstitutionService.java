package com.intuit.service;

import java.util.List;

import com.intuit.entity.InstitutionVO;

public interface InstitutionService {

	InstitutionVO findById(Long id);
	
	List<InstitutionVO> findAllInstitution();
	
	boolean addOne(Long id);
}
