package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Root;
import com.example.model.Train;
import com.example.service.Ratna_Service;

@RestController
@RequestMapping("/IRCTC")
public class RatnaController 
{
	
	@Autowired
    private Ratna_Service service;
 
    @PostMapping("/addRoot")
    public int addProduct(@Valid @RequestBody Root product) {
    	System.out.println("this is add developer");
    	System.out.println("obj is ==="+product);
    	
    	double n = Math.random();
        int n3 = (int) Math.round(Math.random()*1000);
        System.out.println (n3);
        
        product.setRoot_id(n3);
       // return service.saveProduct(product);
        Root r=service.saveProduct(product);
        return r.getRoot_id();
    }

    

    @GetMapping("/Roots")
    public List<Root> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/RootById/{id}")
    public Root findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

//    @GetMapping("/BA/{name}")
//    public BA findProductByName(@PathVariable String name) {
//        return service.getProductByName(name);
//    }

    @PutMapping("/update")
    public Root updateProduct(@RequestBody Root product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
    
    @PostMapping("/trains")
    public int addTrain(@RequestBody Train product) {
    	System.out.println("this is add developer");
    	System.out.println("obj is ==="+product);
        Train t= service.saveTrain(product);
        return t.getTrain_id();
    }
    
    @PutMapping("/updateTrain")
    public String updateTrain(@RequestBody Train product ) {
        Train t= service.updateTrain(product);
        return "train details updated successfully";
    }
    
//    @GetMapping("/findbysource_destination/{source}/{destination}")
//  public List<Root> findProductByName(@PathVariable String source,@PathVariable String destination) {
//     
//    	System.out.println("search by source and destination");
//    	List<Root> list=service.find(source,destination);
//    	
//    	System.out.println("list size=="+list.size());
//    	return list;
//  }


}
