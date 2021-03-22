package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.BA;
import com.example.repository.BARepo;



@Service
public class BAService 
{
	 @Autowired
	    private BARepo repository;

	    public BA saveProduct(BA product) {
	        return repository.save(product);
	    }

	    public List<BA> saveProducts(List<BA> products) {
	        return repository.saveAll(products);
	    }

	    public List<BA> getProducts() {
	        return repository.findAll();
	    }

	    public BA getProductById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public BA getProductByName(String name) {
	        return repository.findByName(name);
	    }

	    public String deleteProduct(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }

	    public BA updateProduct(BA product) {
	    	BA existingProduct = repository.findById(product.getId()).orElse(null);
	        existingProduct.setName(product.getName());
	        existingProduct.setAddress(product.getAddress());
	       
	        return repository.save(existingProduct);
	    }
}
