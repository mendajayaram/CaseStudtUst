package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Employee;

@RestController
public class EurekaClientController 
{


	
	private HttpEntity getHedder()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_PROBLEM_JSON_VALUE);
		
		return new HttpEntity<> (headers);
	}
	
	@GetMapping("/employee")
	public Employee show_employee()
	{
		Employee emp=new Employee();
		
		emp.setEmp_id(101);
		emp.setEmp_name("sharanya");
		emp.setDesignation("developer");
		emp.setSalary(6000);
	    return emp;
	}
	
	

}
