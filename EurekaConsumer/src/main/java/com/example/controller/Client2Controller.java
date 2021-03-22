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
import com.google.gson.Gson;

@RestController
public class Client2Controller {
	
	@Autowired
	DiscoveryClient discoveryclient;
	
	//@Autowired
	//LoadBalancerClient loadbalance;
	
	//@GetMapping("/employeefromconsumer")
	public Employee getEmployee()
	{
		
		System.out.println("coming here or not");
		//List<ServiceInstance> list=discoveryclient.getInstances("Eureka_Client1");
		List<ServiceInstance> list=discoveryclient.getInstances("Eureka_zuul");
		
		ServiceInstance serviceinstance=list.get(0);
		
		
		
		//List<String> string1= discoveryclient.getServices();
		
		//List<ServiceInstance> list=(List<ServiceInstance>) loadbalance.choose("Eureka_Client1");
		
		
		
		
		
		/*ServiceInstance serviceinstance=loadbalance.choose("Eureka_Client1");
		
		System.out.println(serviceinstance.getUri());*/
		System.out.println("list is ......"+list);
		
		if(null!=list && list.size()>0)
		{
		String baseurl=((ServiceInstance) serviceinstance).getUri().toString()+"/producer/employee";
		
		System.out.println("baseurl====="+baseurl);
		
		RestTemplate restemplate=new RestTemplate();
		
		ResponseEntity<String> response=restemplate.exchange(baseurl,HttpMethod.GET,getHedder(),String.class);
		
		System.out.println(response.getBody()+"***********");
		
		Gson g = new Gson();  
		Employee s = g.fromJson(response.getBody(), Employee.class); 
		System.out.println("student object is....."+s);
		return s;
		}
		else
		{
			return null;
		}
		
		
	}
	private HttpEntity getHedder()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_PROBLEM_JSON_VALUE);
		
		return new HttpEntity<> (headers);
	}

	

}
