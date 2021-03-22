package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello1")
public class HelloController {
	
	@GetMapping("/hello")
	public String msg()
	{
		return "this is welcome message using hello";
	}

}
