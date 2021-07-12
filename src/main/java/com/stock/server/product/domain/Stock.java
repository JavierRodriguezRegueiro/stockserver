package com.stock.server.product.domain;

import com.stock.server.shared.domain.valueobject.InvalidArgumentException;

public class Stock {
    private final int stock;
    public Stock(int stock) throws InvalidArgumentException {
        ensureIsValidStock(stock);
        this.stock = stock;
    }

    private void ensureIsValidStock(int stock) throws InvalidArgumentException {
        if(!isValidStock(stock)) {
            throw new InvalidArgumentException("<Stock does only allow positive values (" + stock + ")>");
        }
    }

    private boolean isValidStock(int stock) {
        return stock >= 0;
    }

    public int getStock() {
        return this.stock;
    }
}
