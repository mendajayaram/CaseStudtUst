package com.practice;

@FunctionalInterface 
interface MyInterface{  
	 void display(String say);  
   
} 
@FunctionalInterface 
interface MyInterface1{  
    
	void display(String say,String str);  
     
}  
@FunctionalInterface 
interface MyInterface2{  
    
	void display(String say,String str,String str1);  
}  
class Hello implements MyInterface,MyInterface1,MyInterface2{  
   
	@Override
	public void display(String say, String str, String str1) {
		// TODO Auto-generated method stub
		System.out.println(say+str+str1);
	}
	@Override
	public void display(String say, String str) {
		// TODO Auto-generated method stub
		System.out.println(say+str);
	}
	@Override
	public void display(String say) {
		// TODO Auto-generated method stub
		System.out.println(say);
	} 
}  
public class Example {  
    public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface ref = Hello::new;  
        ref.display("Hello World!"); 
        MyInterface1 ref1 = Hello::new;  
        ref.display("Hello World!"+ref1.display("hi","hello"));  
        MyInterface2 ref2 = Hello::new;  
        ref.display("Hello World!");  
    }  
}
