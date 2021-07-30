package com.stock.server.product.application;

import com.stock.server.product.domain.Product;
import com.stock.server.product.domain.Name;
import com.stock.server.product.domain.Stock;
import com.stock.server.product.domain.ProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductCreator {
    private final ProductRepository productRepository;

    @Autowired
    public ProductCreator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String createProduct(String name, int stock) throws InvalidArgumentException {
        return saveProductIntoRepository(new Product(Id.generateRandomId(), new Name(name), new Stock(stock)));
    }

    private String saveProductIntoRepository(Product product) {
        this.productRepository.save(product);
        return "Created";
    }
}
