package com.stock.server.shared.domain.valueobject;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

public class Id {
    private final UUID id;

    private Id(UUID id) {
        this.id = id;
    }

    public static Id generateIdFromString(String idString) {
        return new Id(UUID.fromString(idString));
    }

    public static Id generateRandomId() {
        return new Id(UUID.randomUUID());
    }

    public static Id generateEmptyId() {
        return new Id(UUID.fromString("00000000-0000-0000-0000-000000000000"));
    }
    public UUID getValue() {
        return this.id;
    }
}
