package com.ust.casestudy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.casestudy.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
}
