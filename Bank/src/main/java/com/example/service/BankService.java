package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.Bank;
import com.example.repo.BankRepo;

@Service
public class BankService {
	
	@Autowired 
	private BankRepo bankrepo;

	public Bank addAccount(Bank banks1) {
		// TODO Auto-generated method stub
		
		Bank bank=bankrepo.save(banks1);
		return bank;
	}

	public String updateBankBalance(Bank banks1) {
		Bank existingBank = bankrepo.findById(banks1.getAccno()).orElse(null);;
    	
		String status="";
		System.out.println(existingBank+".....existing bank details");
		
		int balance_available=(int) existingBank.getBalance();
		
		if(balance_available>500)
		{
		existingBank.setBalance(balance_available-banks1.getBalance());
		status="";
		}
		
		System.out.println(existingBank+".....existing bank details after price deduction");
    	
        bankrepo.save(existingBank);
        return status;
	}

}
