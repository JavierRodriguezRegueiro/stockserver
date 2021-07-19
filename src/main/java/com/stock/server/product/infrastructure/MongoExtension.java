package com.stock.server.product.infrastructure;

import com.stock.server.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MongoExtension extends MongoRepository<Product, String> {}
