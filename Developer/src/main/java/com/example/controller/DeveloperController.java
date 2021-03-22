package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Developer;
import com.example.service.DeveloperService;

@RestController
@RequestMapping("/developer_welcome")
public class DeveloperController 
{
	 @Autowired
	    private DeveloperService service;
	 
	 
	 	@GetMapping("/abc")
	    public String demo() {
	        return "hello";
	    }

	    @PostMapping("/addDeveloper")
	    public Developer addProduct(@RequestBody Developer product) {
	    	System.out.println("this is add developer");
	    	System.out.println("obj is ==="+product);
	        return service.saveProduct(product);
	    }

	    @PostMapping("/addDevelopers")
	    public List<Developer> addProducts(@RequestBody List<Developer> products) {
	        return service.saveProducts(products);
	    }

	    @GetMapping("/developers")
	    public List<Developer> findAllProducts() {
	        return service.getProducts();
	    }

	    @GetMapping("/developerById/{id}")
	    public Developer findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }

//	    @GetMapping("/developer/{name}")
//	    public Developer findProductByName(@PathVariable String name) {
//	        return service.getProductByName(name);
//	    }

	    @PutMapping("/update")
	    public Developer updateProduct(@RequestBody Developer product) {
	        return service.updateProduct(product);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	    }
}
