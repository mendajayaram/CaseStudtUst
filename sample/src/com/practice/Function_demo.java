package com.practice;

import java.util.function.Function;

public class Function_demo {
	
	public static void main(String args[])
	{
		Function<String, Integer> f=i->i.length();
		
		Function<String, Boolean> f1=i->i.equalsIgnoreCase("sharanya");
		
		Function<String, Boolean> f2=i->i.length()>5;
		
		System.out.println(f.apply("sharanya"));
		
		System.out.println(f1.apply("sharanya"));
		
		System.out.println(f2.apply("sha"));
	}

}
