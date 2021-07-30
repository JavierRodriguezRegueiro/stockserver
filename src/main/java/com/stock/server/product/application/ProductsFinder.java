package com.stock.server.product.application;

import com.stock.server.product.domain.ProductDTO;
import com.stock.server.product.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.stock.server.product.domain.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ProductsFinder {
    private final ProductRepository productRepository;

    @Autowired
    public ProductsFinder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ArrayList<ProductDTO> findProducts() {
        ArrayList<ProductDTO> productsToReturn = new ArrayList<ProductDTO>();
        for (Product product : this.productRepository.findAll()) {
            productsToReturn.add(new ProductDTO(product.getProductId().getValue(), product.getName().getValue(), product.getStock().getValue()));
        }
        return productsToReturn;
    }
}
