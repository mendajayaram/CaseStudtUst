package com.practice;

interface A1
{
	void X();
}
interface B1
{
	void X1(int a2);
}

public class with_and_without_params {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 a=()-> System.out.println("this is A method");
		
		a.X();
		
		B1 b=(a2)-> System.out.println("this is B method"+a2);
		
		b.X1(5);
		
		

	}

}
