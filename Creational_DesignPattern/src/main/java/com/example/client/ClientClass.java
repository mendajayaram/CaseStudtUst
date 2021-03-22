package com.example.client;

import java.util.Scanner;

import com.example.factory.FactoryClass;
import com.example.model.Plan;

public class ClientClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		FactoryClass fc=new FactoryClass();
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter type");
		
		String type=sc.next();
		
		System.out.println("enter unit");
		
		int unit=sc.nextInt();
		
		
		Plan p=fc.getPlan(type);
		
		System.out.println("let see");
		p.getRate();
		
		p.calculate(unit);
	}

}
