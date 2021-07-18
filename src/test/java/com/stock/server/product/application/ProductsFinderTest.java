package com.stock.server.product.application;

import com.stock.server.product.domain.*;
import com.stock.server.product.infrastructure.InMemoryProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class ProductsFinderTest {

    @Test
    void getProductsFromRepository() throws InvalidArgumentException {
        ProductRepository repository = new InMemoryProductRepository();
        Product product1 = new Product(Id.generateRandomId(), new Name("shirt"), new Stock(8));
        Product product2 = new Product(Id.generateRandomId(), new Name("trousers"), new Stock(3));
        repository.save(product1);
        repository.save(product2);
        ProductsFinder productsFinder = new ProductsFinder(repository);
        ArrayList<ProductDTO> products = productsFinder.findProducts();
        assertEquals(products.size(), 2);
        assertEquals(products.get(0).getId(), product1.getId().getId());
        assertEquals(products.get(1).getId(), product2.getId().getId());
    }
}
