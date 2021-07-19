package com.stock.server.product.application;

import com.stock.server.product.domain.ProductRepository;
import com.stock.server.product.mock.InMemoryProductRepository;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductCreatorTest {
    @Test
    void shouldCreateProductWithoutError() throws InvalidArgumentException {
        ProductRepository repository = new InMemoryProductRepository();
        ProductCreator productCreator =  new ProductCreator(repository);
        assertEquals(productCreator.createProduct("shirt", 5), "OK");
    }
}
