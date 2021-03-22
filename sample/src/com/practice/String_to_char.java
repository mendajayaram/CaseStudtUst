package com.practice;

public class String_to_char {

	public static void main(String[] args) {
		char ch = 'a';
	      String str = Character.toString(ch);
	      System.out.println("String is: "+str);
	 
	      // Method 2: Using valueOf() method
	      String str2 = String.valueOf(ch);
	      System.out.println("String is: "+str2);

	}

}
