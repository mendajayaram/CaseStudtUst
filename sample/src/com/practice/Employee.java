package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
	
	String name;
	double sal;
	String address;
	
	Employee(String name1,double payment,String address1)
	{
		name=name1;
		sal=payment;
		address=address1;
		System.out.println("salary====="+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Employee> p=i->i.sal>12000;
		
		Predicate<Employee> p1=i->i.address.equals("mumbai");
		
		
		
		
		List<Employee> e=new ArrayList<Employee>();
		
		e.add(new Employee("rama",13000,"mumbai"));
		e.add(new Employee("krishna",12000,"pune"));
		e.add(new Employee("venu",10000,"mumbai"));
		e.add(new Employee("seenu",10000,"hyd"));
		e.add(new Employee("veena",20000,"mumbai"));
		
				
		for(Employee e1:e)
			
		{
			
		//if(p.test(e1))
			//if(p1.test(e1))
		if(p.test(e1) && p1.test(e1))
		{
			System.out.println("employee details"+e1.name+"--->"+e1.sal+"city===="+e1.address);
		}
		}
		
	}

}
