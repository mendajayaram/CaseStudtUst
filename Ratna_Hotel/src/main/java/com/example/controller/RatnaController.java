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

import com.example.model.HotelRoom;
import com.example.service.Ratna_Service;

@RestController
@RequestMapping("/Ratna_welcome")
public class RatnaController 
{
	
	@Autowired
    private Ratna_Service service;
 
    @PostMapping("/addRoom")
    public HotelRoom addProduct(@RequestBody HotelRoom product) {
    	System.out.println("this is add developer");
    	System.out.println("obj is ==="+product);
        return service.saveProduct(product);
    }

    

    @GetMapping("/Rooms")
    public List<HotelRoom> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/RoomById/{id}")
    public HotelRoom findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

//    @GetMapping("/BA/{name}")
//    public BA findProductByName(@PathVariable String name) {
//        return service.getProductByName(name);
//    }

//    @PutMapping("/update")
//    public BA updateProduct(@RequestBody BA product) {
//        return service.updateProduct(product);
//    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
