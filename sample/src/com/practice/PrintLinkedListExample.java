package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintLinkedListExample {

	public static void main(String[] args) {
	LinkedList<String> linkedListColors = new LinkedList<String>();
        
        linkedListColors.add("Red");
        linkedListColors.add("Green");
        linkedListColors.add("Blue");
        linkedListColors.add("Yellow");
        
        System.out.println("Printing elements using for loop");
        
     
        for(int i = 0; i < linkedListColors.size(); i++)
            System.out.println( linkedListColors.get(i) );
        
        List li=new ArrayList<Integer>();
        li.add(20);
        li.add(33);
        li.add(22);
        li.add(50);
        li.add(11);
        
        for(int i=0;i<li.size();i++)
        {
        	
        	
        		System.out.println(li.get(i));
        	
        }
        
        System.out.println("multiply by 2");
        
        List li2=new ArrayList();
       
        for(int i=0;i<li.size();i++)
        {
        	int j=(int) li.get(i);
        	li2.add(j*2);
        }
        		 for(int i=0;i<li2.size();i++)
        	        {
        	        	
        	        	
        	        		System.out.println(li2.get(i));
        	        	
        	        }
        
        		
      
        
      
    }

	}


