package com.shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		      FlipCart obj = (FlipCart) context.getBean("flipcart");
		     System.out.println(obj.shopping("laptop"));
		   }
	



}
