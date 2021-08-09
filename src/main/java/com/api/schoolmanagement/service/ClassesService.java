package com.api.schoolmanagement.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.schoolmanagement.entities.Classes;
import com.api.schoolmanagement.repository.ClassesRepository;
@Service
public class ClassesService {
	
	@Autowired
	private ClassesRepository classesRepository;

	public List<Classes> getAllClasses() {
		return classesRepository.findAll();
		
	}

	public Classes getClasses(Long id) {
		return classesRepository.findById(id).get();
	}
	
	public void addClasses(Classes classes) {
		classesRepository.save(classes);
	}

}
