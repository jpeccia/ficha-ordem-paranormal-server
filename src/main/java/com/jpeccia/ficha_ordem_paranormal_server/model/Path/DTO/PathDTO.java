package com.jpeccia.ficha_ordem_paranormal_server.model.Path.DTO;

import java.util.List;

public record PathDTO(
    Long id,
    String name,
    String description,
    List<String> abilities
) {}
