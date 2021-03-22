package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Tester;
import com.example.repository.TesterRepo;



@Service
public class TesterService 
{
	 @Autowired
	    private TesterRepo repository;

	    public Tester saveTester(Tester product) {
	        return repository.save(product);
	    }

	    public List<Tester> saveTesters(List<Tester> products) {
	        return repository.saveAll(products);
	    }

	    public List<Tester> getTesters() {
	        return repository.findAll();
	    }

	    public Tester getTesterById(int id) {
	        return repository.findById(id).orElse(null);
	    }

//	    public Tester getTesterByName(String name) {
//	        return repository.findByName(name);
//	    }

	    public String deleteTester(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }

	    public Tester updateProduct(Tester product) {
	    	Tester existingProduct = repository.findById(product.getId()).orElse(null);
	        existingProduct.setName(product.getName());
	        existingProduct.setAdress(product.getAdress());
	       
	        return repository.save(existingProduct);
	    }
}
