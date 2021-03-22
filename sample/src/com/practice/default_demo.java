package com.practice;


interface demo
{
default void abc()
{
	System.out.println("this is abc method");
}
}
public class default_demo implements demo{

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		demo d=new default_demo();
		
		d.abc();
		

	}

}
