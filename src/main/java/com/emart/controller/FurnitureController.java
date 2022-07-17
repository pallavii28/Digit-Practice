package com.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.emart.model.Furniture;
import com.emart.service.FurnitureService;


public class FurnitureController {

	@Autowired
	FurnitureService furnitureService; 

	@GetMapping("")
	public ResponseEntity<List<Furniture>> getAllFurnitures(){
		List<Furniture> furniture=furnitureService.findAllFurnitures();
		return new ResponseEntity<>(furniture, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Furniture> saveFurnitures(@RequestBody Furniture Furniture){
		Furniture fur=furnitureService.saveFurnitures(Furniture);
		return new ResponseEntity<>(fur, HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Furniture>> getFurnitureById(@PathVariable("id") Integer id){
		Optional<Furniture> fur=furnitureService.getFurnitureById(id);
		return new ResponseEntity<>(fur, HttpStatus.OK);
	}
}
