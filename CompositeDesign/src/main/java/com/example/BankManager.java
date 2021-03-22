package com.example;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee{
	
	private int id;
	private String name;
	private double salary;
	

	public BankManager(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	List<Employee> employees=new ArrayList<Employee>();

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("ID==="+id);
		System.out.println("Name===="+name);
		System.out.println("Salary====="+salary);
		
		//Iterator<Employee> 
		
	}

	public Employee getChild(int childnumber) {
		// TODO Auto-generated method stub
		//employees.get(childnumber);
		return null;
	}

	public void add(Employee emp) {
		// TODO Auto-generated method stub
		employees.add(emp);
	}

	public void remove(Employee emp) {
		// TODO Auto-generated method stub
		employees.remove(emp);
	}

}
