package com.stock.server.product.domain;

import com.stock.server.shared.domain.valueobject.InvalidArgumentException;

public class Name {
    private final String name;

    public Name(String name) throws InvalidArgumentException{
        ensureIsAValidName(name);
        this.name=name;
    }

    public void ensureIsAValidName(String name) throws InvalidArgumentException{
        if(!isAlpha(name)) {
            throw new InvalidArgumentException("<Name does only allow alphabetic characters (" + name + ")>");
        }
    }

    private boolean isAlpha(String characters) {
        return characters.matches("^[\\p{L} .'-]+$");
    }

    public String getName() {
        return this.name;
    }
}
