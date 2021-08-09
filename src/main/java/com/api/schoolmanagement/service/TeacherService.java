package com.api.schoolmanagement.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.schoolmanagement.entities.Teacher;
import com.api.schoolmanagement.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;

	public List<Teacher> getAllTeacher() {
		return teacherRepository.findAll();
		
	}

	public Teacher getTeacher(Long id) {
		return teacherRepository.findById(id).get();
	}

	public void addTeacher(Teacher teacher) {
		teacherRepository.save(teacher);
		
	}

}
