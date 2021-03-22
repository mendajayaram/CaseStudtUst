package com.ust.casestudy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.casestudy.model.Plans;

public interface PlansRepository extends JpaRepository<Plans, Integer> {
}
