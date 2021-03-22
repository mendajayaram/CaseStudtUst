package com.test;

public class Student {
	
	int rno;
	String name;
	String address;
	public Student(int rno, String name, String address) {
		super();
		this.rno = rno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", address=" + address + "]";
	}

}
