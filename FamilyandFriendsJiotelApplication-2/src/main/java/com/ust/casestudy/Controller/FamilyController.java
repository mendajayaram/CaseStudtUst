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

import com.ust.casestudy.Service.FamilyService;
import com.ust.casestudy.model.Family;


@RestController
@RequestMapping("/familyDetails")
public class FamilyController {
	@Autowired
	private FamilyService familyService;

	@GetMapping("/familylist")
	public List<Family> list() {
		return familyService.listAllfamily();
	}

	@GetMapping("/familybyid/{id}")
	public ResponseEntity<Family> get(@PathVariable Integer id) {
		try {
			Family family = familyService.getfamily(id);
			return new ResponseEntity<Family>(family, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Family>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/registerfamily")
	public Family  add(@RequestBody Family family) {
		familyService.savefamily(family);
		return family;
	}

	@PutMapping("/updatefamily/{id}")
	public ResponseEntity<?> update(@RequestBody Family family, @PathVariable Integer id) {
		try {
			Family existUser = familyService.getfamily(id);
			family.setId(id);
			familyService.savefamily(family);
			return new ResponseEntity<>(family,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("OOPS!! Data Not Found",HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deletefamily/{id}")
	public void delete(@PathVariable Integer id) {

		familyService.deletefamily(id);
	}
}
