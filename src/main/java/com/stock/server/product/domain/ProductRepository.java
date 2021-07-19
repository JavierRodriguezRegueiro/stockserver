package com.stock.server.product.domain;

import java.util.ArrayList;
import java.util.List;

import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;

public interface ProductRepository {
    void save(Product product);
    ArrayList<Product> findAll();
    Product find(Id id) throws InvalidArgumentException;
}
