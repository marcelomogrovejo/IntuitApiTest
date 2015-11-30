package com.intuit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intuit.entity.Institution;
import com.intuit.repository.InstitutionRepository;

//@Service
@Component
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
