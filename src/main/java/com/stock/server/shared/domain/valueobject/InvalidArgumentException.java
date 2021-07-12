package com.stock.server.shared.domain.valueobject;

public class InvalidArgumentException extends Exception {
    public InvalidArgumentException(String msg) {
        super(msg);
    }
}
