package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.model.LoginUser;
import com.example.service.LoginService;

@RestController
@RequestMapping("/login_welcome")
public class LoginController 
{
	@Autowired
	
	private LoginService service;
	
	@PostMapping("/addUser")
    public LoginUser addHr(@RequestBody LoginUser user) {
        return service.saveuser(user);
    }

	
	
	 @PostMapping("/login")
	    public String addProduct(@RequestBody LoginUser user) {
	    	System.out.println("this is login uing api gate way");
	    	System.out.println("obj is ==="+user);
	    	
	    	LoginUser user1=service.getEmail(user.getEmail());
	    	
	    	
	    	if(user.getName().equals("sharanya") && user.getEmail().equals("sharanya@gmail.com"))
	    	{
	    		if(user.getRole().equals("hr"))
	    		{
	    			return "http://localhost:9991";
	    		}
	    		else if(user.getRole().equals("developer"))
	    		{
	    			return "http://localhost:9992";
	    		}
	    		else if(user.getRole().equals("ba"))
	    		{
	    			return "http://localhost:9993";
	    		}
	    		else if(user.getRole().equals("tester"))
	    		{
	    			return "http://localhost:9994";
	    		}
	    		else
	    		{
	    			return "role is not mapped";
	    		}
	    	}
	    	
	    	else
	    	{
	    		return "you are an in valid user";
	    	}
	    	
	    
	    }
}
