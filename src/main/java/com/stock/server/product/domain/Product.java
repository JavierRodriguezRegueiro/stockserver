package com.stock.server.product.domain;

import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    private final Id productId;
    private final Name name;
    private final Stock stock;

    public Product(Id productId, Name name, Stock stock) {
        this.productId = productId;
        this.name = name;
        this.stock = stock;
    }

    public Id getProductId() {
        return productId;
    }

    public Name getName() {
        return name;
    }

    public Stock getStock() {
        return stock;
    }

    public static Product generateEmptyProduct() throws InvalidArgumentException {
        return new Product(Id.generateEmptyId(), Name.generateEmptyName(), Stock.generateEmptyStock());
    }

    @Override
    public String toString() {
        return "id: " + this.productId.getValue() + " name: " + this.name.getValue() + " stock: " + this.stock.getValue();
    }
}
