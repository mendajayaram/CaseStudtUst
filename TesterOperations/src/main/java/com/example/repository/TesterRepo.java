package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Tester;


public interface TesterRepo extends JpaRepository<Tester, Integer>
{
	// Tester findByName(String name);
}
