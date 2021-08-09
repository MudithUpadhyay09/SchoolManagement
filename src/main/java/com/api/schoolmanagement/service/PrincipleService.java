package com.api.schoolmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.schoolmanagement.entities.Principle;
import com.api.schoolmanagement.repository.PrincipleRepository;
@Service
public class PrincipleService {
	
	@Autowired
	private PrincipleRepository principleRepository;
	
	public List<Principle> getAllPrinciple() {
	
		return principleRepository.findAll();
		
	}

	public Principle getPrinciple(Long id) {
		return principleRepository.findById(id).get();
		}

	public void addPrinciple(Principle principle) {
		principleRepository.save(principle);
		
	}


}
