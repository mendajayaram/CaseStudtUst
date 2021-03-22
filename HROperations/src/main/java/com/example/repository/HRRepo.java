package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.HR;


@Repository
public interface HRRepo extends JpaRepository<HR,Integer> {
    HR findByName(String name);
}


