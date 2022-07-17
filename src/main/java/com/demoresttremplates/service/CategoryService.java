package com.demoresttremplates.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoresttremplates.model.Category;
import com.demoresttremplates.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	public List<Category> findAllCategories() {
		
		
		return categoryRepository.findAll();
	}

	public Category saveCategory(Category product) {
		
		return categoryRepository.save(product);
	}

	public Optional<Category> getCategoryById(Integer id) {
		
		return categoryRepository.findById(id);
	}
	
	public String deleteCategory(int id) {
		
		categoryRepository.deleteById(id);
		return "Deleted";
		
	}

}
