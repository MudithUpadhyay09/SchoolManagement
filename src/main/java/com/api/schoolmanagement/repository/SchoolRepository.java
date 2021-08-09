package com.api.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.schoolmanagement.entities.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

}
