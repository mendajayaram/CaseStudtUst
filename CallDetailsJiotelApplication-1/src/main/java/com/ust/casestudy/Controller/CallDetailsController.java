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

import com.ust.casestudy.Service.CallDetailsService;

import com.ust.casestudy.model.CallDetails;

@RestController
@RequestMapping("/CallDetails")
public class CallDetailsController {
	@Autowired
	private CallDetailsService customerService;

	@GetMapping("/CallDetailslist")
	public List<CallDetails> list() {
		return customerService.listAllCallDetails();
	}

	@GetMapping("/CallDetailsrbyid/{id}")
	public ResponseEntity<CallDetails> get(@PathVariable Integer id) {
		try {
			CallDetails callDetails = customerService.getCallDetailsByid(id);
			return new ResponseEntity<CallDetails>(callDetails, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<CallDetails>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/registerCallDetails")
	public CallDetails add(@RequestBody CallDetails callDetails) {
		customerService.saveCallDetails(callDetails);
		return callDetails;
	}

	@PutMapping("/updateCallDetails/{id}")
	public ResponseEntity<?> update(@RequestBody CallDetails callDetails, @PathVariable Integer id) {
		try {
			CallDetails existUser = customerService.getCallDetailsByid(id);
			callDetails.setId(id);
			customerService.saveCallDetails(callDetails);
			return new ResponseEntity<>(callDetails, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("oops!!!!!! Data Not found", HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteCallDetails/{id}")
	public void delete(@PathVariable Integer id) {

		customerService.deleteCallDetails(id);
		
	}
}
