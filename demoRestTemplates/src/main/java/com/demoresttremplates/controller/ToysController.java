package com.demoresttremplates.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoresttremplates.model.Toys;
import com.demoresttremplates.service.ToysService;

@RestController
@RequestMapping("/toys")
public class ToysController {
	
	@Autowired
	ToysService toysService;

	@GetMapping("")
	public ResponseEntity<List<Toys>> getAllToys(){
		List<Toys> toys=toysService.findAllToys();
		return new ResponseEntity<>(toys, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Toys> saveToys(@RequestBody Toys toys){
		Toys toy=toysService.saveToys(toys);
		return new ResponseEntity<>(toy, HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Toys>> getProductById(@PathVariable("id") Integer id){
		Optional<Toys> toy=toysService.getToysById(id);
		return new ResponseEntity<>(toy, HttpStatus.OK);
	}
	
}
