package com.jjwte.SpringSecurityTraining.controllers;

import com.jjwte.SpringSecurityTraining.entities.Product;
import com.jjwte.SpringSecurityTraining.repositories.ProductRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping
    public ResponseEntity<List<Product>> findAll(){

        List<Product> products = productRepository.findAll();

        if(products != null && !products.isEmpty()){
            return ResponseEntity.ok(products);
        }

        return ResponseEntity.notFound().build();
    }


    @PostMapping
    public ResponseEntity<Product> createOne(@RequestBody @Valid Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                productRepository.save(product)
        );
    }

}
