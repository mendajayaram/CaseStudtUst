package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.controller")
public class SpringBootProj5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj5Application.class, args);
		System.out.println("welcome........");
	}

}
