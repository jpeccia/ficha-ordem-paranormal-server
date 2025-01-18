package com.jpeccia.ficha_ordem_paranormal_server.model.CharacterSheet.DTO;

public record CreateCharacterSheetDTO(
    String name,
    String description,
    int agility,
    int strength,
    int intellect,
    int presence,
    int vigor,
    Long originId,
    Long classId,
    Long pathId
) {}
