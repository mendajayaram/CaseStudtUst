package com.practice;

import java.util.function.Predicate;

public class predicate_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(66));
		System.out.println(p.test(25));
		
		int a[]= {33,44,2,5,6};
		
		for(int i:a)
		{
			if(p.test(i))
			{
				System.out.println(i);
			}
		}

	}

}
