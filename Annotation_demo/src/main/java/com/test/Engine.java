package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Engine")
public class Engine {
	
	@Value("100")
	private int id;
	
	@Value("petrol")
	private String type;

	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}
	
	

}
