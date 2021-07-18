package com.stock.server.product.application;

import com.stock.server.product.domain.Product;
import com.stock.server.product.domain.Name;
import com.stock.server.product.domain.Stock;
import com.stock.server.product.domain.ProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCreator {
    private final ProductRepository productRepository;

    @Autowired
    public ProductCreator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping(path = "/create")
    public String createProduct(@RequestParam("name") String name, @RequestParam("stock") int stock) throws InvalidArgumentException {
        this.productRepository.save(new Product(Id.generateRandomId(), new Name(name), new Stock(stock)));
        return "OK";
    }
}
