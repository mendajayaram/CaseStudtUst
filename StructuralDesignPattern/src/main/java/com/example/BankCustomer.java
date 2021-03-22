package com.example;

import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard{
	
	
	Scanner sc=new Scanner(System.in);

	public void giveBankDetails() {
		// TODO Auto-generated method stub
		System.out.println("enter acc holder name");
		
		String customername=sc.next();
		
		System.out.println("enter acc no");
		
		long accno=sc.nextLong();
		
		
		System.out.println("enter bank name");
		
		String bankname=sc.next();
		
		
		setAccholdername(customername);
		setAccountno(accno);
		setBankname(bankname);
		
	}

	public String getCreditCard() {
		// TODO Auto-generated method stub
		return "accno=="+getAccountno()+"acc h name=="+getAccholdername()+"bank name=="+getBankname();
	}

}
