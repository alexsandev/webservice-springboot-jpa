package com.alexjunior.projectspringbootjpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexjunior.projectspringbootjpa.entities.Product;
import com.alexjunior.projectspringbootjpa.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService services;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok().body(services.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(services.findById(id));
    }
}
