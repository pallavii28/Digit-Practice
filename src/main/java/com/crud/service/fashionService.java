package com.crud.service;


import com.crud.bean.Cloth;
import com.crud.dao.fashionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class fashionService {

    @Autowired
    fashionDao fashionDao;

    public List<Cloth> findAllProducts() {


        return fashionDao.findAll();
    }

    public Cloth saveProducts(Cloth cloth) {

        return fashionDao.save(cloth);
    }

    public Optional<Cloth> getProductById(Integer id) {

        return fashionDao.findById(id);
    }

    public Cloth updateById(Cloth cloth) {
        return fashionDao.save(cloth);
    }

}

