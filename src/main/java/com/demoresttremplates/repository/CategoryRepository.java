package com.demoresttremplates.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoresttremplates.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
