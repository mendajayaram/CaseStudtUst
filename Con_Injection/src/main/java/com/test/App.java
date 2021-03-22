package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      Student obj = (Student) context.getBean("student");
	     System.out.println(obj.toString());
	     Marks obj1 = (Marks) context.getBean("marks");
	     System.out.println(obj1.toString());
	     
	     Student obj2 = (Student) context.getBean("student1");
	     System.out.println(obj2.toString());
	}

}
