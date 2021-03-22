package com.practice;

interface vehicle3 
{ 
   
  void price(); 
} 

public class vehicle_imp_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle3 v=()-> 
		{
			int pr=21;
			System.out.println("price is===="+pr);
		};
		
		v.price();
		

	}

}
