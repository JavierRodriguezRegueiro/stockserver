package com.stock.server.shared.domain.valueobject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdTest {

    @Test
    void createIdWithoutError() {
        Id id = Id.generateRandomId();
        assertNotNull(id.getId());
    }

    @Test
    void createIdFromString() {
        Id id = Id.generateIdFromString("f706f558-0027-43df-994f-43d2e39a815e");
        assertNotNull(id.getId());
    }
}
