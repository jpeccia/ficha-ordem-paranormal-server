package com.jpeccia.ficha_ordem_paranormal_server.model.Origin.DTO;

import java.util.List;

public record OriginDTO(
    Long id,
    String name,
    String description,
    List<String> benefits
) {}
