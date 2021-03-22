package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentDetails {
	
	String sname;
	int srno;
	String scity;
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}
	
	StudentDetails(String name,int rno,String city)
	{
		sname=name;
		srno=rno;
		scity=city;
		
	}
	
	@Override
	public String toString() {
		return "StudentDetails [sname=" + sname + ", srno=" + srno + ", scity=" + scity + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter no of student details you want ");
		
		int count=s.nextInt();
		
		ArrayList<StudentDetails> al=new ArrayList<>();
		for(int i=0;i<count;i++)
		{
			System.out.println("enter s name");
			
			String name_s=s.next();
			
			System.out.println("enter s rollno");
			
			int rno_s=s.nextInt();
			
			
			System.out.println("enter s address");
			
			String address_s=s.next();
			
			StudentDetails student=new StudentDetails(name_s,rno_s,address_s);
			
			
			
			
			al.add(student);
			
			
		}
		
		System.out.println("student details are");
		
		for(StudentDetails s1:al)
		{
			System.out.println(s1.sname+";;;"+s1.srno+";;;;"+s1.scity);
		}
		
		//printing student details in reverse order
		
		
		ArrayList<StudentDetails> al2=(ArrayList<StudentDetails>) al.stream().sorted((s1,s2)->-s1.getSname().compareTo(s2.getSname())).collect(Collectors.toList());
		
		System.out.println("student  names in reverse");
		
		for(StudentDetails s1:al2)
		{
			System.out.println(s1.sname+";;;"+s1.srno+";;;;"+s1.scity);
		}
		
		
		// get student with minimum rno
		StudentDetails st1 = al.stream()
		                .collect(Collectors.minBy(Comparator.comparingInt(StudentDetails::getSrno)))
		                .get();
		
		System.out.println("student with minimum rno");
		System.out.println(st1.sname+";;;"+st1.srno+";;;;"+st1.scity);
		
		// get student with max rno
		// get student with minimum rno
				StudentDetails st2 = al.stream()
				                .collect(Collectors.maxBy(Comparator.comparingInt(StudentDetails::getSrno)))
				                .get();
				
				System.out.println("student with max rno");
				//System.out.println(st2.sname+";;;"+st2.srno+";;;;"+st2.scity);
				System.out.println(st2.toString());
				
				
				// get student with minimum rno
				StudentDetails st3 = al.stream().min((s1,s2)->String.valueOf(s1.srno).compareTo(String.valueOf(s2.srno))).get();
				                
				
				System.out.println("student with max rno");
				System.out.println(st3.sname+";;;"+st3.srno+";;;;"+st3.scity);
				
				//student name in alphabetical order
				
				
				
				ArrayList<StudentDetails> al3=(ArrayList<StudentDetails>) al.stream().sorted((s1,s2)->-s1.getSname().compareTo(s2.getSname())).collect(Collectors.toList());
				
				System.out.println("student  names in reverse");
				
				for(StudentDetails s1:al3)
				{
					System.out.println(s1.sname+";;;"+s1.srno+";;;;"+s1.scity);
				}
				
				
//				ArrayList<StudentDetails> al4= al.stream().map(s1.getSname() -> s1.getSname().toUpperCase()).collect(Collectors.toList());
//			
//				
//				System.out.println("student  names in reverse");
//				
//				for(StudentDetails s1:al3)
//				{
//					System.out.println(s1.sname+";;;"+s1.srno+";;;;"+s1.scity);
//				}
//				
//				
				
				

	}

	

	

}
