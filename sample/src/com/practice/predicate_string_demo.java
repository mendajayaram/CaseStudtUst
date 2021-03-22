package com.practice;

import java.util.function.Predicate;

public class predicate_string_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> p=i->i.length()%2==0;
		
		String a[]= {"amala","rani","karan","sai","shreya"};
		
		for(String  i:a)
		{
		
			if(p.test(i))
			{
				System.out.println("even  and length is   "+i+" ...."+i.length());
			}
		}

	}

}
