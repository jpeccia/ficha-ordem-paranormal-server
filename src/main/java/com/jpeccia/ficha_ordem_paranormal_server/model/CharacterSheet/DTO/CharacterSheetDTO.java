package com.jpeccia.ficha_ordem_paranormal_server.model.CharacterSheet.DTO;

import java.util.List;

import com.jpeccia.ficha_ordem_paranormal_server.model.Attributes.DTO.AttributesDTO;
import com.jpeccia.ficha_ordem_paranormal_server.model.CharacterClass.DTO.CharacterClassDTO;
import com.jpeccia.ficha_ordem_paranormal_server.model.DerivedStats.DTO.DerivedStatsDTO;
import com.jpeccia.ficha_ordem_paranormal_server.model.InventoryItem.DTO.InventoryItemDTO;
import com.jpeccia.ficha_ordem_paranormal_server.model.Origin.DTO.OriginDTO;
import com.jpeccia.ficha_ordem_paranormal_server.model.Path.DTO.PathDTO;
import com.jpeccia.ficha_ordem_paranormal_server.model.Ritual.DTO.RitualDTO;
import com.jpeccia.ficha_ordem_paranormal_server.model.Skill.DTO.SkillDTO;

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
