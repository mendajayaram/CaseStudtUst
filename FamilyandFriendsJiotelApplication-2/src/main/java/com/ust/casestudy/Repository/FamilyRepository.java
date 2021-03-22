package com.ust.casestudy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.casestudy.model.Family;

public interface FamilyRepository extends JpaRepository<Family, Integer> {
}
