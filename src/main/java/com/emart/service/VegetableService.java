package com.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.emart.model.Vegetable;
import com.emart.repository.VegetableRepository;

@Service
public class VegetableService {
	
	@Autowired
	VegetableRepository productRepository;

	public List<Vegetable> findAllProducts() {
		
		
		return productRepository.findAll();
	}

	public Vegetable saveProducts(Vegetable vegetable) {
		
		return productRepository.save(vegetable);
	}

	public Optional<Vegetable> getProductById(Integer id) {
		
		return productRepository.findById(id);
	}

	public Vegetable updateProductById(Vegetable vegetable) {
		
		 return productRepository.save(vegetable);
	}


}
