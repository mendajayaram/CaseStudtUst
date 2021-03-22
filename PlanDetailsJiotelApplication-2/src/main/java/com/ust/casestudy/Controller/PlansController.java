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

import com.ust.casestudy.Service.PlansService;

import com.ust.casestudy.model.Plans;

@RestController
@RequestMapping("/planDetails")
public class PlansController {
	@Autowired
	private PlansService customerService;

	@GetMapping("/planlist")
	public List<Plans> list() {
		return customerService.listAllplans();
	}

	@GetMapping("/planbyid/{id}")
	public ResponseEntity<Plans> get(@PathVariable Integer id) {
		try {
			Plans plans = customerService.getplan(id);
			return new ResponseEntity<Plans>(plans, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Plans>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/registerplan")
	public Plans  add(@RequestBody Plans user) {
		customerService.saveplans(user);
		return user;
	}

	@PutMapping("/updateplan/{id}")
	public ResponseEntity<?> update(@RequestBody Plans plans, @PathVariable Integer id) {
		try {
			Plans existUser = customerService.getplan(id);
			plans.setId(id);
			customerService.saveplans(plans);
			return new ResponseEntity<>(plans,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("OOPS!!! Data Not Found ",HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteplan/{id}")
	public void delete(@PathVariable Integer id) {

		customerService.deleteplan(id);
	}
}
