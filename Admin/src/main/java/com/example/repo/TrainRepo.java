package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Train;

public interface TrainRepo extends JpaRepository<Train,Integer> 
{

}