package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.model.Furniture;

public interface FurnitureRepository  extends JpaRepository<Furniture, Integer>{

}
