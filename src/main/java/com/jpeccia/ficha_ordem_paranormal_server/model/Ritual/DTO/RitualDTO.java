package com.jpeccia.ficha_ordem_paranormal_server.model.Ritual.DTO;

public record RitualDTO(
    Long id,
    String name,
    String type,
    String circle,
    String range,
    String target,
    String duration,
    String resistance
) {}
