package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeveloperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperApplication.class, args);
		System.out.println("This is my developer app");
	}

}
