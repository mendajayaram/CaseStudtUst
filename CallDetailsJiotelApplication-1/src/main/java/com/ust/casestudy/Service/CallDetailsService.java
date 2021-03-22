package com.ust.casestudy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.casestudy.Repository.CallDetailsRepository;
import com.ust.casestudy.model.CallDetails;

@Service
public class CallDetailsService {
	@Autowired
	private CallDetailsRepository callRepository;

	public List<CallDetails> listAllCallDetails() {
		return callRepository.findAll();
	}

	public void saveCallDetails(CallDetails callDetails) {
		callRepository.save(callDetails);
	}

	public CallDetails getCallDetailsByid(Integer id) {
		return callRepository.findById(id).get();
	}

	public void deleteCallDetails(Integer id) {
		callRepository.deleteById(id);
	}
}
