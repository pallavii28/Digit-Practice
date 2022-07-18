package com.demoresttremplates.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoresttremplates.model.Toys;

public interface ToysRepository extends JpaRepository<Toys, Integer>{

}
