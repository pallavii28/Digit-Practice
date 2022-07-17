package com.demoresttremplates.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demoresttremplates.model.Category;
import com.demoresttremplates.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;

	@GetMapping("")
	public ResponseEntity<List<Category>> getAllCategories(){
		List<Category> cat=categoryService.findAllCategories();
		return new ResponseEntity<>(cat, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Category> saveCategory(@RequestBody Category product){
		Category cat=categoryService.saveCategory(product);
		return new ResponseEntity<>(cat, HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Category>> getCategoryById(@PathVariable("id") Integer id){
		Optional<Category> cat=categoryService.getCategoryById(id);
		return new ResponseEntity<>(cat, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCategory(@PathVariable("id") int id) {
		return categoryService.deleteCategory(id);
		
	}
	
}
