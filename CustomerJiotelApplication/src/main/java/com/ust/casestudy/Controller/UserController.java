package com.ust.casestudy.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.casestudy.Repository.UserRepository;
import com.ust.casestudy.Service.CustomerService;
import com.ust.casestudy.Service.Status;
import com.ust.casestudy.model.Customer;

@RestController
@RequestMapping("/customerDetails")
public class UserController {
	@Autowired
	private CustomerService customerService;

	@GetMapping("/customerlist")
	public List<Customer> list() {
		return customerService.listAllCustomer();
	}

	@GetMapping("/customerbyid/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id) {
		try {
			Customer user = customerService.getCustomer(id);
			return new ResponseEntity<Customer>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/registercustomer")
	public Customer  add(@RequestBody Customer user) {
		customerService.saveCustomer(user);
		return user;
	}

	@PutMapping("/updatecustomer/{id}")
	public ResponseEntity<?> update(@RequestBody Customer user, @PathVariable Integer id) {
		try {
			Customer existUser = customerService.getCustomer(id);
			user.setId(id);
			customerService.saveCustomer(user);
			return new ResponseEntity<>(existUser,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("OOPS!!! No Data Found",HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deletecustomer/{id}")
	public void delete(@PathVariable Integer id) {

		customerService.deleteCustomer(id);
	}
	
	
	@PostMapping("/login/{username}/{password}")
	public String Login (@PathVariable String username,@PathVariable String password) {
		System.out.println("Login Validation========>");
		System.out.println("Id==="+username +" ,"+"password====="+password);
		List<Customer>list=customerService.listAllCustomer();
		System.out.println("list===="+list);
		for (Customer customer : list) {
			System.out.println("List"+customer);
			System.out.println("username="+customer.getUsername());
			if(customer.getUsername()!=null && customer.getPassword()!=null) {
				
			
			if(customer.getUsername().equalsIgnoreCase(username)&& customer.getPassword().equalsIgnoreCase(password)) {
				return "Login Sucessfully";
			}
			}
		}
		return "Invalid Login case";
		
		
	}	
}
	

