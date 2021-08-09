package com.api.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.schoolmanagement.entities.School;
import com.api.schoolmanagement.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	private SchoolService schoolService;
	
	@GetMapping("/getschool")
	public List<School> getAllSchool(){
		return schoolService.getAllSchool();
	}
	
	@GetMapping("/getschool/{id}")
	public School getSchool(@PathVariable Long id) {
		return schoolService.getSchool(id);
	}
	
	@PostMapping("/addschool")
	public void addSchool(@RequestBody School school) {
		schoolService.addSchool(school);
	}


}
