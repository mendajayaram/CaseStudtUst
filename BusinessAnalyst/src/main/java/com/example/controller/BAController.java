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

import com.example.model.BA;

import com.example.service.BAService;

@RestController
@RequestMapping("/ba_welcome")
public class BAController 
{

	@Autowired
    private BAService service;
 
    @PostMapping("/addBA")
    public BA addProduct(@RequestBody BA product) {
    	System.out.println("this is add developer");
    	System.out.println("obj is ==="+product);
        return service.saveProduct(product);
    }

    @PostMapping("/addBAs")
    public List<BA> addProducts(@RequestBody List<BA> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/BAs")
    public List<BA> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/BAById/{id}")
    public BA findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/BA/{name}")
    public BA findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public BA updateProduct(@RequestBody BA product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
