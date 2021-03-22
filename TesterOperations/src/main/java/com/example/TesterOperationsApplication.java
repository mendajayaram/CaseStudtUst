package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesterOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesterOperationsApplication.class, args);
		System.out.println("this is my tester app");
	}

}
