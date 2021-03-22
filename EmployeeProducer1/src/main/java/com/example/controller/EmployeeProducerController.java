package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
public class EmployeeProducerController 
{
	@GetMapping("/employee")
	public Employee fetchEmployee() {
		
		Employee emp=new Employee();
		
		emp.setEmp_id(101);
		emp.setEmp_name("sharanya");
		emp.setDesignation("developer");
		emp.setSalary(6000);
	    return emp;
	}
	

}
