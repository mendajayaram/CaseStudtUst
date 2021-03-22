package com.example.dto;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BankRequestDto 
{

	private int accno;
	//private double price;
	private LocalDate date;
	private double balance;
	private String status;
	public int getAccno() {
		return accno;
	}
	public LocalDate getDate() {
		return date;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BankRequestDto [accno=" + accno + ", date=" + date + ", balance=" + balance + "]";
	}
	
	
}
