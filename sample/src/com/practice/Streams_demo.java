package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++)
		{
			li.add(i);
		}
		
		System.out.println(li);
		List<Integer> li2=li.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		
		long count=li.stream().filter(i->i%2==0).count();
		
		
		System.out.println("count is====="+count);
		
		System.out.println(li2);
		
		
		ArrayList<String> si=new ArrayList<String>();
		
		si.add("eerer");
		si.add("bbfg");
		si.add("ev");
		si.add("dd");
		
		System.out.println(si);
		
		List<String> si2=si.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(si2);
		
		
		System.out.println(si.stream().filter(i->i.length()>3).count()+";;;;");
		
		long cnt1=si.stream().filter(i->i.length()>3).count();
		
		System.out.println("more than  3 chars===="+cnt1);
		
		System.out.println(li);
		List<Integer> li3=li.stream().map(i->i+2).collect(Collectors.toList());
		
		System.out.println(li3);
		
		
		
		//sorting
		
ArrayList<String> si3=new ArrayList<String>();
		
		si3.add("e");
		si3.add("a");
		si3.add("d");
		si3.add("b");
		
		System.out.println(si3);
		
		//ascending order
		List<String> si4=si3.stream().sorted().collect(Collectors.toList());
		
		System.out.println(si4);
		
		//Descending order
		List<String> si5=si3.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		
		System.out.println(si5);
		
		
		//min max
		
		String min_str=si3.stream().min((s1,s2)->s1.compareTo(s2)).get();
		
		System.out.println("min str value is====="+min_str);
		
		String max_str=si3.stream().max((s1,s2)->s1.compareTo(s2)).get();
		
		System.out.println("max str value is====="+max_str);
		
		
		//min and max
		
		ArrayList<Integer> ji=new ArrayList<Integer>();
		
		for(int i=5;i<=9;i++)
		{
			ji.add(i);
		}
		
		
		int min=ji.stream().min((s1,s2)->s1.compareTo(s2)).get();
		
		System.out.println("min value is====="+min);
		
		int max=ji.stream().max((s1,s2)->s1.compareTo(s2)).get();
		
		System.out.println("max value is====="+max);
		
		
	
	}

}
