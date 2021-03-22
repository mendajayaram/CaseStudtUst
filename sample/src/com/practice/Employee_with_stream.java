package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee_with_stream {
	
	String name;
	double sal;
	String address;
	
	public Employee_with_stream(String name1,double payment,String address1)
	{
		name=name1;
		sal=payment;
		address=address1;
		System.out.println("salary====="+sal);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Employee_with_stream> e=new ArrayList<Employee_with_stream>();
		
		e.add(new Employee_with_stream("rama",13000,"mumbai"));
		e.add(new Employee_with_stream("krishna",12000,"pune"));
		e.add(new Employee_with_stream("venu",10000,"mumbai"));
		e.add(new Employee_with_stream("seenu",10000,"hyd"));
		e.add(new Employee_with_stream("veena",20000,"mumbai"));
		
		
		System.out.println(e);
		
		
		// get user with minimum Sal
		Employee_with_stream emp1 = e.stream()
		                .collect(Collectors.minBy(Comparator.comparingDouble(Employee_with_stream::getSal)))
		                .get();
		
		System.out.println("minimum salary employee");
		System.out.println(emp1.getName()+"---"+emp1.getSal());
		
		// get user with max Sal
				Employee_with_stream emp2 = e.stream()
				                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee_with_stream::getSal)))
				                .get();
				
				System.out.println("maximum salary employee");
				System.out.println(emp2.getName()+"---"+emp2.getSal());
				
				
				
				//desc order
				
//				List<Employee_with_stream> e2= e.stream()
//		                .collect(Collectors.sorted(Comparator.comparingDouble(Employee_with_stream::getSal)))
//		                .get();
				
				
				//reverse order 
				
				 List < Employee_with_stream > employeesSortedList1 = e.stream()
				            .sorted((o1, o2) -> -(int)(o1.getSal() - o2.getSal())).collect(Collectors.toList());
				        System.out.println(employeesSortedList1);
				        
				    	for(Employee_with_stream e3:employeesSortedList1)
						{
							System.out.println(e3.getName()+";;;"+e3.getSal());
						}
		
	}

}
