package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bank;
import com.example.service.BankService;

@RestController
public class BankController {
	
	@Autowired 
	private BankService bankservice;
	
	@GetMapping("/info")
	public String info()
	{
		return "your bank server is up.....";
	}
	
	
	@PostMapping("/addAccount")
	//public ResponseEntity<Bank> add_Account(@RequestBody Bank banks1)
	public ResponseEntity<Bank> add_Account(@RequestBody Bank banks1)
	{
		System.out.println(banks1);
		String status="";
		
		
		//This is to update bank balance ----deducting balance using ticket price
		
		
		Bank Bank=bankservice.updateBankBalance(banks1);
		
		
		
		//Bank bank=bankservice.addAccount(banks1);
		//System.out.println("after"+banks1);
		
//		if(bank!=null)
//		{
//			status="success";
//		}
//		else
//		{
//			status="fail";
//		}
		return new ResponseEntity<Bank> (Bank,HttpStatus.ACCEPTED);
		
		
	}
}
