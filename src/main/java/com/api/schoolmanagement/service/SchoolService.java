package com.api.schoolmanagement.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.schoolmanagement.entities.School;
import com.api.schoolmanagement.repository.SchoolRepository;
@Service

public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	public List<School> getAllSchool() {
	
		return schoolRepository.findAll(); 
		
	}

	public School getSchool(Long id) {
		return schoolRepository.findById(id).get();
	}

	public void addSchool(School school) {
		schoolRepository.save(school);
		
	}

}
