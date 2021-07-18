package com.stock.server.product.domain;

import java.util.ArrayList;
import com.stock.server.shared.domain.valueobject.Id;

public interface ProductRepository {
    void save(Product product);
    ArrayList<Product> findAll();
    Product find(Id id);
}
