package com.stock.server.product.domain;

import com.stock.server.product.domain.Product;
import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductTest {
    Id id;
    Name name;
    Stock stock;

    @BeforeClass
    public static void testSetup() throws InvalidArgumentException {
        Id id = Id.generateRandomId();
        Name name = new Name("shirt");
        Stock stock = new Stock(5);
    }

    @Test
    void createProductWithoutError() {
         Product product = new Product(id, name, stock);
         assertNotNull(product);
     }
}
