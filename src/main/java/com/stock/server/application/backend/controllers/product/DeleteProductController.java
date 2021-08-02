package com.stock.server.application.backend.controllers.product;

import com.stock.server.product.application.ProductRemover;
import com.stock.server.shared.domain.valueobject.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteProductController {

    private final ProductRemover productRemover;

    @Autowired
    public DeleteProductController(ProductRemover productRemover) {
        this.productRemover = productRemover;
    }

    @DeleteMapping(path = "/product/remove")
    public ResponseEntity<String> removeProduct(@RequestParam("id") String id) {
        try {
            return new ResponseEntity<>(this.productRemover.removeProduct(Id.generateIdFromString(id)), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
