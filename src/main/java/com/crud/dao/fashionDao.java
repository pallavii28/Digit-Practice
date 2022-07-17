package com.crud.dao;

import com.crud.bean.Cloth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface fashionDao extends JpaRepository<Cloth, Integer> {

}

