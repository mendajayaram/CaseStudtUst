package com.practice;

import java.util.function.Predicate;

public class pred_3 {

	public static void main(String[] args) 
	{
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
