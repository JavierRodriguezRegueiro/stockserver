package com.stock.server.shared.domain.valueobject;
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

    public UUID getValue() {
        return this.id;
    }
}
