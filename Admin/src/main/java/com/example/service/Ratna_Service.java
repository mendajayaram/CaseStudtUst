package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Root;
import com.example.model.Train;
import com.example.repo.RatnaRepo;
import com.example.repo.TrainRepo;

@Service
public class Ratna_Service {
	
	@Autowired
    private RatnaRepo repository;
	
	@Autowired
    private TrainRepo repository1;

    public Root saveProduct(Root product) {
        return repository.save(product);
    }

   

    public List<Root> getProducts() {
        return repository.findAll();
    }

    public Root getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

//    public HotelRoom getProductByName(String name) {
//        return repository.findByName(name);
//    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Root updateProduct(Root product) {
    	Root existingProduct = repository.findById(product.getRoot_id()).orElse(null);
        existingProduct.setTrain(product.getTrain());
        existingProduct.setTrain_no(product.getTrain_no());
        existingProduct.setSource(product.getSource());
        existingProduct.setDestination(product.getDestination());
      return repository.save(existingProduct);
    }
    
    public Train saveTrain(Train product1) {
        return repository1.save(product1);
    }



	public Train updateTrain(Train product) {
		
		
		Train existingProduct = repository1.findById(product.getTrain_id()).orElse(null);
        existingProduct.setTrain_id(product.getTrain_id());
        existingProduct.setName(product.getName());
        existingProduct.setDetails(product.getDetails());
      
        return  repository1.save(existingProduct);
      
        
	}
	
//	 public List<Root> find(String source,String destination) {
//       return repository.find(source,destination);
//   }

}
