package com.stock.server.application.backend.controllers.product;
import com.stock.server.product.application.ProductFinder;
import com.stock.server.product.domain.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetProductController {
    private final ProductFinder productFinder;

    @Autowired
    public GetProductController(ProductFinder productFinder) {
        this.productFinder = productFinder;
    }

    @GetMapping(path = "/product/find")
    public ResponseEntity<ProductDTO> getProduct(@RequestParam("id") String id) {
        try {
            return new ResponseEntity<>(this.productFinder.findProduct(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
