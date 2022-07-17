package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.model.Vegetable;

public interface VegetableRepository extends JpaRepository<Vegetable	, Integer>{

}
