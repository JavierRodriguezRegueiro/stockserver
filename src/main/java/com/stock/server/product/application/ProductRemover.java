package com.stock.server.product.application;

import com.stock.server.product.domain.ProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductRemover {
    private final ProductRepository productRepository;

    @Autowired
    public ProductRemover(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public String removeProduct(Id id) {
        return removeProductFromRepository(id);
    }

    private String removeProductFromRepository(Id id) {
        this.productRepository.remove(id);
        return "Removed";
    }
}
