package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Student;
import com.google.gson.Gson;

@RestController
public class StudentConsumerController 
{
	//@Autowired
//	DiscoveryClient discoveryclient;
	
	@Autowired
	LoadBalancerClient loadbalance;
	
	@GetMapping("/getstudent")
	public ResponseEntity<String> getStudent()
	//public Student getStudent()
	{
//		List<ServiceInstance> list=discoveryclient.getInstances("Eureka_Client1");
//		
//		List<String> string1= discoveryclient.getServices();
		
		//List<ServiceInstance> list=(List<ServiceInstance>) loadbalance.choose("Eureka_Client1");
		
		
		
		//System.out.println("list size======"+list.size());
		
		
		
		//ServiceInstance serviceinstance=list.get(0);
		
		
		ServiceInstance serviceinstance=loadbalance.choose("Student_Producer");
		
		System.out.println(serviceinstance.getUri());
		String baseurl=((ServiceInstance) serviceinstance).getUri().toString()+"/student";
		
		System.out.println("baseurl====="+baseurl);
		
		RestTemplate restemplate=new RestTemplate();
		
		ResponseEntity<String> response=restemplate.exchange(baseurl,HttpMethod.GET,getHedder(),String.class);
		//ResponseEntity<String> response=restemplate.exchange(baseurl,HttpMethod.GET,getHedder1(),String.class);
		
		System.out.println(response.getBody()+"***********");
		
		
		
		
		
		
		return response;
		
		/*Gson g = new Gson();  
		Student s = g.fromJson(response.getBody(), Student.class); 
		System.out.println("student object is....."+s);
		return s;*/
		
	}
	private HttpEntity getHedder()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_PROBLEM_JSON_VALUE);
		
		return new HttpEntity<> (headers);
	}
	
	private HttpEntity getHedder1()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_PROBLEM_XML_VALUE);
		
		return new HttpEntity<> (headers);
	}
}
