package com.example;

public class SingleObject 
{
	
	 
	//private static SingleObject instance = new SingleObject();

	  
	  private SingleObject(){}
	  public static SingleObject getInstance(){
	     // return instance;
		   
		   return new SingleObject(); 
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }

}
