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

import com.example.model.Tester;
import com.example.service.TesterService;

@RestController
@RequestMapping("/tester_welcome")
public class TeterController 
{
	@Autowired
    private TesterService service;

    @PostMapping("/addTester")
    public Tester addProduct(@RequestBody Tester product) {
        return service.saveTester(product);
    }

    @PostMapping("/addTesters")
    public List<Tester> addProducts(@RequestBody List<Tester> products) {
        return service.saveTesters(products);
    }

    @GetMapping("/testers")
    public List<Tester> findAllProducts() {
        return service.getTesters();
    }

    @GetMapping("/testerById/{id}")
    public Tester findProductById(@PathVariable int id) {
        return service.getTesterById(id);
    }
//
//    @GetMapping("/tester/{name}")
//    public Tester findProductByName(@PathVariable String name) {
//        return service.getTesterByName(name);
//    }

    @PutMapping("/update")
    public Tester updateProduct(@RequestBody Tester product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTester(@PathVariable int id) {
        return service.deleteTester(id);
    }
}
