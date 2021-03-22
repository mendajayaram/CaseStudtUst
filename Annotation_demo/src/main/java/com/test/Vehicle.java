package com.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Vehicle")
public class Vehicle {
	
	@Autowired
	private Engine engine;

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + "]";
	}

}
