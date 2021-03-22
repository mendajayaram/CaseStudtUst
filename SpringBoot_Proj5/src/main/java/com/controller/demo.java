package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demo {
	
	@GetMapping("/")
	@ResponseBody
	public String demo()
	{
		return "string demo app";
	}

}
