package com.practice;

interface vehicle1 
{ 
  int pr = 21; 
  void price(); 
} 

public class vehicle_impl_anonymas_cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle1 oj1 = new vehicle1() { 
	            @Override
	            public void price() { 
	                 // printing  age 
	                System.out.print("price is "+pr); 
	            } 
	        }; 
	        oj1.price(); 

	}

}
