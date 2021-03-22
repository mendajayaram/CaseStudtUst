package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.LoginUser;

public interface LoginRepo extends JpaRepository<LoginUser, Integer>
{
	
	LoginUser findByEmail(String email);

}
