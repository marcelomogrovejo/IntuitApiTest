package com.intuit.service;

import com.intuit.entity.InstitutionVO;
import com.intuit.repository.InstitutionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("dbService")
public class InstitutionServiceImpl implements InstitutionService {

	@Autowired
	private InstitutionRepository repository;

	public InstitutionVO findById(Long id) {
		return repository.findOne(id);
	}

	public List<InstitutionVO> findAllInstitution() {
		return repository.findAll();
	}

    @Override
    public boolean addOne(Long id) {
        return false;
    }

}
