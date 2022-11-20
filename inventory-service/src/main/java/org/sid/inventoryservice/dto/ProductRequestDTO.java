package org.sid.inventoryservice.dto;
public record ProductRequestDTO(
    String id,
    String name,
    double price,
    int quantity,
    Long categoryId
) {}
