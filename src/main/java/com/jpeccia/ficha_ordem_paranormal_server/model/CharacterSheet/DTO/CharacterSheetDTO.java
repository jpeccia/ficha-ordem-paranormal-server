package com.jpeccia.ficha_ordem_paranormal_server.model.CharacterSheet.DTO;

public record CharacterSheetDTO(
    Long id,
    String name,
    String description,
    int nex,
    AttributesDTO attributes,
    DerivedStatsDTO derivedStats,
    OriginDTO origin,
    CharacterClassDTO characterClass,
    PathDTO path,
    List<SkillDTO> skills,
    List<RitualDTO> rituals,
    List<InventoryItemDTO> inventory
) {}
