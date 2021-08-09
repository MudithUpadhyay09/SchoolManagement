package com.api.schoolmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ground {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	private String sportsteacher;
	
	
	@OneToOne
	private School school;
	
	
	public Ground() {}

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

	public String getSportsteacher() {
		return sportsteacher;
	}

	public void setSportsteacher(String sportsteacher) {
		this.sportsteacher = sportsteacher;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	
	
	
	

}
