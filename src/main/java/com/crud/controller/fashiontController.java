package com.crud.controller;

import java.util.List;
import java.util.Optional;

import com.crud.bean.Cloth;
import com.crud.service.fashionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fashion")
public class fashiontController {

    @Autowired
    fashionService fashionService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Cloth>> getAllProducts(){
        List<Cloth> product= fashionService.findAllProducts();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Cloth> saveProducts(@RequestBody Cloth cloth){
        Cloth prod= fashionService.saveProducts(cloth);
        return new ResponseEntity<>(prod, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cloth>> getProductById(@PathVariable("id") Integer id){
        Optional<Cloth> prod= fashionService.getProductById(id);
        return new ResponseEntity<>(prod, HttpStatus.OK);
    }

    @PutMapping("/updateById")
    public ResponseEntity<Cloth> updateById(@RequestBody Cloth cloth) {
        Cloth mobiles = fashionService.updateById(cloth);
        return new ResponseEntity<>(mobiles, HttpStatus.OK);
    }
}
