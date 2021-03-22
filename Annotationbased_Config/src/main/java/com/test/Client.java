package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
//	      Student obj=(Student) context.getBean("student");
//	      System.out.println(obj.hashCode());
//	      
//	      System.out.println("***********************");
//	      
//	      Course obj1=(Course) context.getBean("course");
//	      System.out.println(obj1.hashCode());
//	      
//	      System.out.println("***********************");
//
//	      Student obj3=(Student) context.getBean("student");
//		     System.out.println(obj3.hashCode());
//	      System.out.println("***********************");
//		      
//		      Course obj14=(Course) context.getBean("course");
//		      
//		      
//		      System.out.println(obj14.hashCode());
		 
		 Test test1=(Test) context.getBean("test");
         System.out.println(test1.hashCode());
         
         Test test2=(Test) context.getBean("test");
         System.out.println(test2.hashCode());
         
         
         demo demo1=(demo) context.getBean("demo");
         System.out.println(demo1.hashCode());
         
         demo demo2=(demo) context.getBean("demo");
         System.out.println(demo2.hashCode());
         
         
         sample sample1=(sample) context.getBean("sample");
         System.out.println(sample1.hashCode());
         
         sample sample2=(sample) context.getBean("sample");
         System.out.println(sample2.hashCode());

	}

}
