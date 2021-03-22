package com.example.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tester 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//private double price;
	private String name;
	private String adress;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Tester [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
}
