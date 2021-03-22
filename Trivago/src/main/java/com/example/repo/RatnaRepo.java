package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Hotels;

public interface RatnaRepo extends JpaRepository<Hotels,Integer> 
{
	List<Hotels> findByAddress(String address);
}
