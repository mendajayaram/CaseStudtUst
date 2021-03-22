package com.example;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		 
	      //SingleObject object1 = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	}

}
