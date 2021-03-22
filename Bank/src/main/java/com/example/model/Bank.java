package com.example.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_account")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accno;
	//private double price;
	private LocalDate date;
	private double balance;
	private String status;
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAccno() {
		return accno;
	}
	
	public LocalDate getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", date=" + date + ", balance=" + balance + "]";
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
