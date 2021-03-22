package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Hotels;
import com.example.model.HotelsDTO;
import com.example.service.Ratna_Service;

@RestController
@RequestMapping("/Trivago_welcome")
public class RatnaController 
{
	
	@Autowired
    private Ratna_Service service;
 
    @PostMapping("/addHotel")
    public Hotels addProduct(@RequestBody Hotels product) {
    	System.out.println("this is add developer");
    	System.out.println("obj is ==="+product);
        return service.saveProduct(product);
    }

    

    @GetMapping("/HotelsList")
    public List<Hotels> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/HotelById/{id}")
    public Hotels findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/Hotels/{address}")
    public List<HotelsDTO> findProductByAddress(@PathVariable String address) {
    	
    	List<Hotels> list123=service.getProductByAddress(address);
    	List<HotelsDTO> list=new ArrayList<HotelsDTO>();
    	
    	System.out.println("list123 size==="+list123.size());
    	if(null!=list123)
    	{
    	for(int i=0;i<list123.size();i++)
    	{
    		HotelsDTO dto=new HotelsDTO();
    		
    		
    		dto.setHotel_id(list123.get(i).getHotel_id());
    		
    		dto.setName(list123.get(i).getName());
    		
    		dto.setAddress(list123.get(i).getAddress());
    		
    		
    		if(list123.get(i).getAddress().equals("warangal"))
    		{
    			if(list123.get(i).getName().equals("Suprabha_Hotel"))
    			{
    			dto.setAddroomlink("for add link===="+"localhost:8061/Suprabha_welcome/addRoom");
    			}
    			if(list123.get(i).getName().equals("Ratna_Hotel"))
    			{
    			dto.setAddroomlink("for add link===="+"https:localhost:8060/Ratna_welcome/addRoom");
    			}
    		}
    		
    		if(list123.get(i).getAddress().equals("hyd"))
    		{
    			dto.setAddroomlink("for add link===="+"https:localhost:8062/RaviTeja_welcome/addRoom");
    		}
    		
    		dto.setCheck_availability("Available");
    		
    		list.add(dto);
    	}
    	System.out.println("list==="+list);
    	}
        return list;
    }

//    @PutMapping("/update")
//    public BA updateProduct(@RequestBody BA product) {
//        return service.updateProduct(product);
//    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
