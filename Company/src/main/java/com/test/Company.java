package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Company {
	
	@Value("201")
	private int id;
	@Value("softech")
	private String name;
	@Value("wgl")
	private String address;
	
	@Autowired
	Product product;
	
	@Autowired
	Product1 product1;

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + ", product=" + product + ", product1="
				+ product1 + "]";
	}

	

}
