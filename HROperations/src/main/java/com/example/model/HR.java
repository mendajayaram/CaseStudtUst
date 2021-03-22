package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name = "hr_table")
public class HR 
{
	
	@Id
    @GeneratedValue
    private int id;
    private String hr_name;
    private String address;
	public int getId() {
		return id;
	}
	public String getHr_name() {
		return hr_name;
	}
	public String getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setHr_name(String hr_name) {
		this.hr_name = hr_name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "HR [id=" + id + ", hr_name=" + hr_name + ", address=" + address + "]";
	}
    
    

}
