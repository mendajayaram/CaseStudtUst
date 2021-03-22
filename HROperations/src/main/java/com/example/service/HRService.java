package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.HR;
import com.example.repository.HRRepo;



@Service
public class HRService {
	
	  @Autowired
	    private HRRepo repository;

	    public HR saveHr(HR hr) {
	        return repository.save(hr);
	    }

	    public List<HR> saveHrs(List<HR> hrs) {
	        return repository.saveAll(hrs);
	    }

	    public List<HR> getHrs() {
	        return repository.findAll();
	    }

	    public HR getHrById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public HR getHrByName(String name) {
	        return repository.findByName(name);
	    }
	    

	    public String deleteHr(int id) {
	        repository.deleteById(id);
	        return "Hr removed !! " + id;
	    }

	    public HR updateHr(HR hr) {
	    	HR existingProduct = repository.findById(hr.getId()).orElse(null);
	        existingProduct.setHr_name(hr.getHr_name());
	        existingProduct.setAddress(hr.getAddress());
	      
	        return repository.save(existingProduct);
	    }


}
