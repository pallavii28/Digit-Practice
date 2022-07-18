package com.demoresttremplates.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoresttremplates.model.Toys;
import com.demoresttremplates.repository.ToysRepository;

@Service
public class ToysService {
	
	@Autowired
	ToysRepository toysRepository;

	public List<Toys> findAllToys() {
		
		
		return toysRepository.findAll();
	}

	public Toys saveToys(Toys toys) {
		
		return toysRepository.save(toys);
	}

	public Optional<Toys> getToysById(Integer id) {
		
		return toysRepository.findById(id);
	}

}
