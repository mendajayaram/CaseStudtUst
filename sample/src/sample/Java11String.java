package sample;

import java.util.stream.Collectors;

public class Java11String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(" ".isBlank()); //true
	        
	        String s = "Anupam";
	        System.out.println(s.isBlank()); //false
	        String s1 = "";
	        System.out.println(s1.isBlank()); //true
	        
	        
	        String str = "JD\nJD\nJD"; 
	        System.out.println(str);
	        
	        //This method returns a stream of strings, which is a collection of all substrings split by lines.
	        System.out.println("after line method");
	        System.out.println(str.lines().collect(Collectors.toList()));
	        
	        
	        String str1 = " JD "; 
	        System.out.print("Start");
	        System.out.print(str1.strip());
	        System.out.println("End");
	        
	        System.out.print("Start");
	        System.out.print(str1.stripLeading());
	        System.out.println("End");
	        
	        System.out.print("Start");
	        System.out.print(str1.stripTrailing());
	        System.out.println("End");
	        
	        String str5 = "=".repeat(2);
	        System.out.println(str5);

	}

}
