package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.HotelRoom;
import com.example.repo.RatnaRepo;

@Service
public class Ratna_Service {
	
	@Autowired
    private RatnaRepo repository;

    public HotelRoom saveProduct(HotelRoom product) {
        return repository.save(product);
    }

   

    public List<HotelRoom> getProducts() {
        return repository.findAll();
    }

    public HotelRoom getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

//    public HotelRoom getProductByName(String name) {
//        return repository.findByName(name);
//    }

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
