package com.example;

public interface Employee 
{
	int getId();
	String getName();
	double getSalary();
	void print();
	void add(Employee emp);
	void remove(Employee emp);
	Employee getChild(int childnumber);
}
