package com.ust.casestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerJiotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerJiotelApplication.class, args);
	}

}
