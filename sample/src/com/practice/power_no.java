package com.practice;

public class power_no {
	
	static int power(int N, int P) 
    { 
        if (P == 0) 
            return 1; 
        else
            return N * power(N, P - 1); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 4; 
        int P = 5; 
  
        System.out.println(power(N, P)); 

	}

}
