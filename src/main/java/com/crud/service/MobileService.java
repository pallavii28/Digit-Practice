package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.bean.Mobile;
import com.crud.dao.MobileDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class MobileService {

    @Autowired
    MobileDao mobileDao;

    public List<Mobile> findAllProducts() {


        return mobileDao.findAll();
    }

    public Mobile saveProducts(Mobile mobile) {

        return mobileDao.save(mobile);
    }

    public Optional<Mobile> getProductById(Integer id) {

        return mobileDao.findById(id);
    }

    public String deletedById(Integer id) {
        mobileDao.deleteById(id);
        return "deleted data";
    }

    public Mobile updateById(Mobile mobile) {
        return mobileDao.save(mobile);
    }
}
