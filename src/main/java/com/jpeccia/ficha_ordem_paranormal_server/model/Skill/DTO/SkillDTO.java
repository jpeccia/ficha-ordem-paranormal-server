package com.jpeccia.ficha_ordem_paranormal_server.model.Skill.DTO;

public record SkillDTO(
    Long id,
    String name,
    String description,
    String baseAttribute,
    boolean isTrained
) {}
