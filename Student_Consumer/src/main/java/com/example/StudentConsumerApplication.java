package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.example.controller.StudentConsumerController;

@SpringBootApplication
@EnableEurekaClient
public class StudentConsumerApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt=SpringApplication.run(StudentConsumerApplication.class, args);
		
		StudentConsumerController cont=(StudentConsumerController) ctxt.getBean(StudentConsumerController.class);
		cont.getStudent();
	}

}
