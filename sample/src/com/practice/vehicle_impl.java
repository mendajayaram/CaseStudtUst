package com.practice;


interface vehicle 
{ 
  int pr = 21; 
  void price(); 
} 
class vehicle_impl 
{ 
  public static void main(String[] args)  
  { 
     
  	vehicle obj=new vehicle_implementation(); 

      
      obj.price();      
  } 
} 


class vehicle_implementation implements vehicle 
{ 
 
	@Override
	public void price() {
		
		 System.out.print("price is "+pr); 
	} 
} 

	



