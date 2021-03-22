package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

import com.test.Course;
import com.test.Student;
import com.test.Test;
import com.test.demo;
import com.test.sample;

@Configuration
public class AppConfig {

	public AppConfig() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("App Config");
		
	}
	@Scope("singleton")
	@DependsOn("course")
	@Bean(name= "student")
	public Student createstudent()
	{
		System.out.println("student bean");
		System.out.println("only one time it is coming");
		return new Student();
	}
	
	@Scope("prototype")
	@Bean(name= "course")
	public Course createcourse()
	{
		System.out.println("course bean");
		System.out.println("coming when ever object is created");
		return new Course();
	}
	
	
	@Scope("request")
	@Bean(name= "test")
	public Test createtest()
	{
		System.out.println("test bean");
		
		return new Test(10);
	}

	
	@Scope("session")
	@Bean(name= "demo")
	public demo createdemo()
	{
		System.out.println("test demo");
		
		return new demo(20,30);
	}
	
	
	@Scope("application")
	@Bean(name= "sample")
	public sample createsample()
	{
		System.out.println("test demo");
		
		return new sample();
	}
}
