package com.example.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeConsumerController
{

	public void getEmployee()
	{
		String url="http://localhost:2021/employee";
		
		RestTemplate restemplate=new RestTemplate();
		
		ResponseEntity<String> response=restemplate.exchange(url,HttpMethod.GET,getHedder(),String.class);
		
		System.out.println(response.getBody());
		
	}
private HttpEntity getHedder()
{
	HttpHeaders headers=new HttpHeaders();
	headers.set("Accept", MediaType.APPLICATION_PROBLEM_JSON_VALUE);
	
	return new HttpEntity<> (headers);
}
}
