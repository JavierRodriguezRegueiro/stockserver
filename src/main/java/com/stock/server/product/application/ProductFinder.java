package com.stock.server.product.application;

import com.stock.server.product.domain.Product;
import com.stock.server.product.domain.ProductDTO;
import com.stock.server.product.domain.ProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductFinder {
    private final ProductRepository productRepository;

    @Autowired
    public ProductFinder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/find")
    public ProductDTO findProduct(@RequestParam("id") String id) {
        Product product = this.productRepository.find(Id.generateIdFromString(id));
        return new ProductDTO(product.getId().getId(), product.getName().getName(), product.getStock().getStock());
    }
}