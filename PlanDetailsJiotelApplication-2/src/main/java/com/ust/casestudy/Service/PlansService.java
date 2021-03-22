package com.ust.casestudy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.casestudy.Repository.PlansRepository;
import com.ust.casestudy.model.Plans;
@Service
public class PlansService {
	@Autowired
	private PlansRepository plansRepository;
	public List<Plans> listAllplans() {
		return plansRepository.findAll();
	}

	public void saveplans(Plans plans) {
		plansRepository.save(plans);
	}

	public Plans getplan(Integer id) {
		return plansRepository.findById(id).get();
	}

	public void deleteplan(Integer id) {
		plansRepository.deleteById(id);
	}
}
