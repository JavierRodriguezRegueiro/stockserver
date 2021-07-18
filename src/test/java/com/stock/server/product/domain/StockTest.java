package com.stock.server.product.domain;

import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StockTest {

    @Test
    void createStockWithoutError() throws InvalidArgumentException {
        int stockValue = 7;
        Stock stock = new Stock(stockValue);
        assertEquals(stock.getValue(), stockValue);
    }

    @Test
    void throwErrorWhenStockIsInvalid() {
        assertThrows(InvalidArgumentException.class, () -> {
            new Stock(-4);
        });
    }
}
