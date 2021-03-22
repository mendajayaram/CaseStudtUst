package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Hotels;
import com.example.repo.RatnaRepo;

@Service
public class Ratna_Service {
	
	@Autowired
    private RatnaRepo repository;

    public Hotels saveProduct(Hotels product) {
        return repository.save(product);
    }

   

    public List<Hotels> getProducts() {
        return repository.findAll();
    }

    public Hotels getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public List<Hotels> getProductByAddress(String address) {
        return repository.findByAddress(address);
   }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

//    public HotelRoom updateProduct(HotelRoom product) {
//    	HotelRoom existingProduct = repository.findById(product.get).orElse(null);
//        existingProduct.setRoom_Status(product.getClass());
//        existingProduct.setAddress(product.getAddress());
//       
//        return repository.save(existingProduct);
//    }

}
