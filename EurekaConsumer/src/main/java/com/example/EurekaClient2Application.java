package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.example.controller.Client2Controller;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient2Application {

	public static void main(String[] args) {
		ApplicationContext ctxt=SpringApplication.run(EurekaClient2Application.class, args);
		System.out.println("client2 controller.......");
		
		Client2Controller cont=(Client2Controller) ctxt.getBean(Client2Controller.class);
		cont.getEmployee();
	     
	}

}
