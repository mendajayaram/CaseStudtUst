package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.controller.EmployeeConsumerController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeConsumerApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt=SpringApplication.run(EmployeeConsumerApplication.class, args);
		
		EmployeeConsumerController cont=(EmployeeConsumerController) ctxt.getBean(EmployeeConsumerController.class);
		cont.getEmployee();
	}

}
