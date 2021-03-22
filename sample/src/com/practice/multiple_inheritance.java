package com.practice;

interface A
{
	default void show()
	{
		System.out.println("A");
	}
}
interface B
{
	default void show()
	{
		System.out.println("B");
	}
}

public class multiple_inheritance implements A,B {
	
	public void show()
	{
		System.out.println("m Inheritance");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiple_inheritance mi=new multiple_inheritance();
		mi.show();
	}

}
