package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Developer;
import com.example.repository.DeveloperRepo;



@Service
public class DeveloperService 
{
	 @Autowired
	    private DeveloperRepo repository;

	    public Developer saveProduct(Developer product) {
	        return repository.save(product);
	    }

	    public List<Developer> saveProducts(List<Developer> products) {
	        return repository.saveAll(products);
	    }

	    public List<Developer> getProducts() {
	        return repository.findAll();
	    }

	    public Developer getProductById(int id) {
	        return repository.findById(id).orElse(null);
	    }

//	    public Developer getProductByName(String name) {
//	        return repository.findByName(name);
//	    }

	    public String deleteProduct(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }

	    public Developer updateProduct(Developer product) {
	    	Developer existingProduct = repository.findById(product.getId()).orElse(null);
	        existingProduct.setName(product.getName());
	        existingProduct.setAddress(product.getAddress());
	       
	        return repository.save(existingProduct);
	    }
}
