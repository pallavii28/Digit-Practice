package com.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.model.Furniture;
import com.emart.repository.FurnitureRepository;

@Service
public class FurnitureService {

	
	@Autowired
	FurnitureRepository furnitureRepository ;

	public List<Furniture> findAllFurnitures() {
		
		
		return furnitureRepository .findAll();
	}

	public Furniture saveFurnitures(Furniture furniture) {
		
		return furnitureRepository .save(furniture);
	}

	public Optional<Furniture> getFurnitureById(Integer id) {
		
		return furnitureRepository .findById(id);
	}

}
