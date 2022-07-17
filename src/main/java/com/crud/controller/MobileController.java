package com.crud.controller;

import java.util.List;
import java.util.Optional;

import com.crud.bean.Mobile;
import com.crud.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class MobileController {

    @Autowired
    MobileService mobileService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Mobile>> getAllProducts(){
        List<Mobile> product=mobileService.findAllProducts();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Mobile> saveProducts(@RequestBody Mobile mobile){
        Mobile mobile1=mobileService.saveProducts(mobile);
        return new ResponseEntity<>(mobile1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Mobile>> getProductById(@PathVariable("id") Integer id){
        Optional<Mobile> mobile=mobileService.getProductById(id);
        return new ResponseEntity<>(mobile, HttpStatus.OK);
    }
    @PutMapping("/updateById")
    public ResponseEntity<Mobile> updateById(@RequestBody Mobile mobile) {
        Mobile mobiles = mobileService.updateById(mobile);
        return new ResponseEntity<>(mobiles, HttpStatus.OK);

    }

}
