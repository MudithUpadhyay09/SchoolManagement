package com.api.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.schoolmanagement.entities.Classes;

public interface ClassesRepository extends JpaRepository<Classes, Long> {

}
