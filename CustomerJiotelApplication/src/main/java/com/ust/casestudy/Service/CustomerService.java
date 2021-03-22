package com.ust.casestudy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.casestudy.Repository.CustomerRepository;
import com.ust.casestudy.model.Customer;
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository custRepository;
	public List<Customer> listAllCustomer() {
		return custRepository.findAll();
	}

	public void saveCustomer(Customer user) {
		custRepository.save(user);
	}

	public Customer getCustomer(Integer id) {
		return custRepository.findById(id).get();
	}

	public void deleteCustomer(Integer id) {
		custRepository.deleteById(id);
	}
	public Customer saveuser(Customer user) {
		return custRepository.save(user);
	}

	public Customer getEmail(Customer emailid) {
		// TODO Auto-generated method stub
		return emailid;
	}

	public Customer getEmailid(String emailid) {
		// TODO Auto-generated method stub
		return (Customer) custRepository;
	}

	
}
