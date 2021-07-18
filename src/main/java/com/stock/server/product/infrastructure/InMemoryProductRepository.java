package com.stock.server.product.infrastructure;

import com.stock.server.product.domain.Product;
import com.stock.server.product.domain.ProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InMemoryProductRepository implements ProductRepository{
    private ArrayList<Product> products = new ArrayList<Product>();;

    @Override
    public void save(Product product) {
        this.products.add(product);
    }

    @Override
    public ArrayList<Product> findAll() {
        return products;
    }

    @Override
    public Product find(Id id) {
        Product productToReturn = null;
        for (Product product : this.products) {
            if(product.getId().getId().compareTo(id.getId()) == 0) {
                productToReturn = product;
            }
        }
        return productToReturn;
    }

}