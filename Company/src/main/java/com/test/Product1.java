package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Product1 {
	
	@Value("106")
	private int p_id;
	@Value("xyz1")
	private String p_name;
	@Value("p_type2")
	private String p_type;
	@Value("10000")
	private int price;
	@Override
	public String toString() {
		return "Product1 [p_id=" + p_id + ", p_name=" + p_name + ", p_type=" + p_type + ", price=" + price + "]";
	}
	
}
