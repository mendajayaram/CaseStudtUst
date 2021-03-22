package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Engine;
import com.test.Vehicle;





public class demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 
	      Vehicle obj=context.getBean(Vehicle.class);
	      System.out.println(obj);

	}

}
