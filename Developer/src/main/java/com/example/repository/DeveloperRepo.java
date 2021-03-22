package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Developer;



public interface DeveloperRepo extends JpaRepository<Developer,Integer> {
	//Developer findByName(String name);
}
