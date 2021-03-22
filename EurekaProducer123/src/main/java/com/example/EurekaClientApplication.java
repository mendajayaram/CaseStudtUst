package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.example.controller.EurekaClientController;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt=SpringApplication.run(EurekaClientApplication.class, args);
		
		
		System.out.println("Eureka client application");
		
		}

}
