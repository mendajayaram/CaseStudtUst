package com.ust.casestudy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.casestudy.Repository.FamilyRepository;
import com.ust.casestudy.model.Family;

@Service
public class FamilyService {
	@Autowired
	private FamilyRepository familyRepository;
	public List<Family> listAllfamily() {
		return familyRepository.findAll();
	}

	public void savefamily(Family family) {
		familyRepository.save(family);
	}

	public Family getfamily(Integer id) {
		return familyRepository.findById(id).get();
	}

	public void deletefamily(Integer id) {
		familyRepository.deleteById(id);
	}
}
