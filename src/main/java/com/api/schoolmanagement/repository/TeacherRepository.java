package com.api.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.schoolmanagement.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
