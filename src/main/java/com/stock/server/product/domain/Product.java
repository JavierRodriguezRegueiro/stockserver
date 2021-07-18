package com.stock.server.product.domain;

import com.stock.server.shared.domain.valueobject.Id;

public class Product {
    private final Id id;
    private final Name name;
    private final Stock stock;

    public Product(Id id, Name name, Stock stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public Id getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Stock getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "id: " + this.id.getValue() + " name: " + this.name.getValue() + " stock: " + this.stock.getValue();
    }
}
