package com.jpeccia.ficha_ordem_paranormal_server.model.CharacterClass.DTO;

import java.util.List;

public record CharacterClassDTO(
    Long id,
    String name,
    String description,
    List<String> proficiencies,
    List<String> startingSkills
) {}
