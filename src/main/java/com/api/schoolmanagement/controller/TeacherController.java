package com.api.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.schoolmanagement.entities.Teacher;
import com.api.schoolmanagement.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/getteacher")
	public List<Teacher> getAllTeacher(){
		return teacherService.getAllTeacher();
	}
	
	@GetMapping("/getteacher/{id}")
	public Teacher getTeacher(@PathVariable Long id) {
		return teacherService.getTeacher(id);
	}
	
	@PostMapping("/addteacher")
	public void addTeacher(@RequestBody Teacher teacher) {
		teacherService.addTeacher(teacher);
	}

}
