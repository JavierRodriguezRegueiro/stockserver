package com.stock.server.application.backend.controllers.product;

import com.stock.server.product.application.ProductCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostProductController {
    private final ProductCreator productCreator;

    @Autowired
    public PostProductController(ProductCreator productCreator) {
        this.productCreator = productCreator;
    }

    @PostMapping(path = "/product/create")
    public ResponseEntity<String> postProduct(@RequestParam("name") String name, @RequestParam("stock") int stock) {
        try {
            return new ResponseEntity<>(this.productCreator.createProduct(name, stock), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
