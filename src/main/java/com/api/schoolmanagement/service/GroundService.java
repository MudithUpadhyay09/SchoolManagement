package com.api.schoolmanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.schoolmanagement.entities.Ground;
import com.api.schoolmanagement.repository.GroundRepository;
@Service
public class GroundService {

	@Autowired
	private GroundRepository groundRepository;
	
	public List<Ground> getAllGround() {
		
		return groundRepository.findAll();
	}

	public Ground getGround(Long id) {
		return groundRepository.findById(id).get();
	}

	public void addGround(Ground ground) {
		groundRepository.save(ground);
		
	}

}
