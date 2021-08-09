package com.api.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.schoolmanagement.entities.Classes;
import com.api.schoolmanagement.service.ClassesService;

@RestController
public class ClassesController {
	
	@Autowired
	private ClassesService classesService;
	
	@GetMapping("/getclasses")
	public List<Classes> getAllClasses(){
		return classesService.getAllClasses();
	}
	
	@GetMapping("/getclasses/{id}")
	public Classes getClasses(@PathVariable Long id) {
		return classesService.getClasses(id);
	}
	
	@PostMapping("/addclasses")
	public void addClasses(@RequestBody Classes classes) {
		classesService.addClasses(classes);
	}

}
