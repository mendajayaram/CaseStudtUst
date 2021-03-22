package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Root;

public interface RatnaRepo extends JpaRepository<Root,Integer> 
{
//	@Query("SELECT p FROM Root p WHERE p.source = :source and p.destination= :detination")
//    public List<Root> find(@Param("source") String source,@Param("destination") String destination);
}

