package com.api.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.schoolmanagement.entities.Students;

public interface StudentsRepository extends JpaRepository<Students, Long> {

}
