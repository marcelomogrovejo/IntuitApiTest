package com.intuit.service;

import com.intuit.entity.Institution;
import com.intuit.repository.InstitutionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("dbService")
public class InstitutionServiceImpl implements InstitutionService {

	@Autowired
	private InstitutionRepository repository;

	public Institution findById(Long id) {
		return repository.findOne(id);
	}

	public List<Institution> findAllInstitution() {
		return repository.findAll();
	}

}
