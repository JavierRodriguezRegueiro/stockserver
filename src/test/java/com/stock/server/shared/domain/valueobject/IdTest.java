package com.stock.server.shared.domain.valueobject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdTest {

    @Test
    void createIdWithoutError() {
        Id id = Id.generateRandomId();
        assertNotNull(id.getId());
    }
}
