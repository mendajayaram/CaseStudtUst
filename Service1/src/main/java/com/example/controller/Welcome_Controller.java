package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome_Controller {
	
	@GetMapping("/message")
	public String msg()
	{
		return "this is welcome message";
	}

}
