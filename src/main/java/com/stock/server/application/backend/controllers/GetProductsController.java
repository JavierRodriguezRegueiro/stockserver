package com.stock.server.application.backend.controllers;
import com.stock.server.product.application.ProductsFinder;
import com.stock.server.product.domain.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GetProductsController {
    private final ProductsFinder productsFinder;

    @Autowired
    public GetProductsController(ProductsFinder productsFinder) {
        this.productsFinder = productsFinder;
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<ArrayList<ProductDTO>> getProducts() {
        try {
            return new ResponseEntity<>(this.productsFinder.findProducts(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
