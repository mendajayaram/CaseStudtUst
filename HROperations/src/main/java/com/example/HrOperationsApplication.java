package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HrOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOperationsApplication.class, args);
		System.out.println("this i my hr application");
	}

}
