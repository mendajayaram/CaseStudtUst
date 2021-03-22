package com.practice;

import java.util.function.Predicate;

public class pred5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=i->i%2==0;
		//Predicate<Integer> p1=i->i>0;
		
		int a[]= {12,13,14,15,-9};
		
		for(int  i:a)
		{
		
			if(p.negate().test(i))
			{
				System.out.println("even  and length is   "+i);
			}
		}
	}

}
