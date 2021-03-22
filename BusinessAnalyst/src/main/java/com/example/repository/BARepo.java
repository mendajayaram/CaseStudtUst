package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.BA;



public interface BARepo extends JpaRepository<BA,Integer> {
	BA findByName(String name);
}
