package com.stock.server.product.domain;

import java.util.UUID;

public class ProductDTO {
    private final UUID id;
    private final String name;
    private final int stock;

    public ProductDTO (UUID id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

}
