package com.emart.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emart.model.Vegetable;
import com.emart.service.VegetableService;

@RestController
@RequestMapping("/vegetable")
public class VegetableController {
	
	@Autowired
	VegetableService productService;

	@GetMapping("")
	public ResponseEntity<List<Vegetable>> getAllProducts(){
		List<Vegetable> vegetable=productService.findAllProducts();
		return new ResponseEntity<>(vegetable, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Vegetable> saveProducts(@RequestBody Vegetable vegetable){
		Vegetable veg=productService.saveProducts(vegetable);
		return new ResponseEntity<>(veg, HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Vegetable>> getProductById(@PathVariable("id") Integer id){
		Optional<Vegetable> veg=productService.getProductById(id);
		return new ResponseEntity<>(veg, HttpStatus.OK);
	}
	/*
	 * @PutMapping("/{id}") public ResponseEntity<Vegetable>
	 * updateProductById(@RequestBody Vegetable vegetable){ Vegetable
	 * veg=productService.updateProductById(vegetable); return new
	 * ResponseEntity<>(veg, HttpStatus.OK); }
	 */
	

	@PutMapping("/{id}")
	public Vegetable updateProductById( @PathVariable("id") Integer id, @RequestBody Vegetable veg) {
	return productService.updateProductById(id, veg);
	}
	
	
}
