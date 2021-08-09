package com.api.schoolmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.schoolmanagement.entities.Students;
import com.api.schoolmanagement.repository.StudentsRepository;
@Service
public class StudentsService {
	
	@Autowired
	private StudentsRepository studentsRepository;
	
	public List<Students> getAllStudents() {

		return studentsRepository.findAll();
		
	}

	public Students getStudents(Long id) {
		return studentsRepository.findById(id).get();
	}

	public void addstudents(Students students) {
		studentsRepository.save(students);
		
	}

}
