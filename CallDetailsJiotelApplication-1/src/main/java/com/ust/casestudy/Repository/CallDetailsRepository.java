package com.ust.casestudy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.casestudy.model.CallDetails;

public interface CallDetailsRepository extends JpaRepository<CallDetails, Integer> {
}
