package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.HotelRoom;

public interface RatnaRepo extends JpaRepository<HotelRoom,Integer> 
{

}
