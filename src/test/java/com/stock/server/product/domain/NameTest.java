package com.stock.server.product.domain;

import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NameTest {

    @Test
    void createNameWithoutError() throws InvalidArgumentException {
        String stringName = "Blue shirt";
        Name name = new Name(stringName);
        assertEquals(name.getName(), stringName);
    }

    @Test
    void throwErrorWhenNameIsNotValid() {
        assertThrows(InvalidArgumentException.class, () -> {
            new Name("4-&ñ");
        });
    }
}
