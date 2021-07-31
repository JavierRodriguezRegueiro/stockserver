package com.stock.server.product.application;

import com.stock.server.product.domain.Name;
import com.stock.server.product.domain.Product;
import com.stock.server.product.domain.ProductRepository;
import com.stock.server.product.domain.Stock;
import com.stock.server.product.mock.InMemoryProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductRemoverTest {

    @Test
    void shouldRemoveProductWithoutError() throws InvalidArgumentException {
        ProductRepository repository = new InMemoryProductRepository();
        ProductRemover productRemover = new ProductRemover(repository);
        String idString = "8c673c78-1cf5-427d-b09b-b6b729f8326a";
        Id productId = Id.generateIdFromString(idString);
        Product product = new Product(productId, new Name("shirt"), new Stock(8));
        repository.save(product);
        assertEquals(productRemover.removeProduct(productId), "Removed");
    }
}
