package com.practice;

interface fun1
{
	void demo();
}

public class Inner_demo {
	
	 private int data=30;  
     class Inner{  
      void msg()
      {
    	fun1 f=() -> 
    	{
    		int a=10;
    		System.out.println("some text===="+a);
    	};
    	f.demo();
      }
     }

	public static void main(String[] args) {
		Inner_demo obj=new Inner_demo();  
		Inner_demo.Inner in=obj.new Inner(); 
		in.msg();
		
		

	}
     }

	
   
