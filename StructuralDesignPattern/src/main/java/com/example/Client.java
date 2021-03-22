package com.example;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard c=new BankCustomer();
		
		
		c.giveBankDetails();
		System.out.println(c.getCreditCard());
	}

}
