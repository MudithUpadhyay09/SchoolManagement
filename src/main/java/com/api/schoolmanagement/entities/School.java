package com.api.schoolmanagement.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String name;
	private Integer phoneNumber;
	
	
	@OneToMany
	private List<Teacher> teacher;
	@OneToMany
	private List<Classes> classes;
	@OneToMany
	private List<Ground> ground;
	@OneToOne
	private Principle principle;
	@OneToMany
	private List<Students> students;
	
	
	public School() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public List<Classes> getClasses() {
		return classes;
	}

	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}

	public List<Ground> getGround() {
		return ground;
	}

	public void setGround(List<Ground> ground) {
		this.ground = ground;
	}

	public Principle getPrinciple() {
		return principle;
	}

	public void setPrinciple(Principle principle) {
		this.principle = principle;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	

}
