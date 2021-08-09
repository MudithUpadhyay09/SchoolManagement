package com.api.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.schoolmanagement.entities.Students;
import com.api.schoolmanagement.service.StudentsService;

@RestController
public class StudentsController {
	
	@Autowired
	private StudentsService studentsService;
	
	@GetMapping("/getstudents")
	public List<Students> getAllStudents(){
		return studentsService.getAllStudents();
	}
	
	@GetMapping("/getstudents/{id}")
	public Students getStudents(@PathVariable Long id) {
		return studentsService.getStudents(id);
	}
	
	@PostMapping("/addstudents")
	public void addStudents(@RequestBody Students students) {
		studentsService.addstudents(students);
	}


}
