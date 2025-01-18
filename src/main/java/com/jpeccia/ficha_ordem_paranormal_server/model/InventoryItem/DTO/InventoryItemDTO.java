package com.jpeccia.ficha_ordem_paranormal_server.model.InventoryItem.DTO;

public record InventoryItemDTO(
    Long id,
    String name,
    String type,
    int weight
) {}
