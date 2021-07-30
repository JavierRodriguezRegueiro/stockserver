package com.stock.server.product.application;

import com.stock.server.product.domain.Product;
import com.stock.server.product.domain.ProductDTO;
import com.stock.server.product.domain.ProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductFinder {
    private final ProductRepository productRepository;

    @Autowired
    public ProductFinder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDTO findProduct(String id) throws InvalidArgumentException {
        Product product = this.productRepository.find(Id.generateIdFromString(id));
        return new ProductDTO(product.getProductId().getValue(), product.getName().getValue(), product.getStock().getValue());
    }
}
