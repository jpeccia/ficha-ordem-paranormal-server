package com.jpeccia.ficha_ordem_paranormal_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpeccia.ficha_ordem_paranormal_server.model.Skill.DTO.SkillDTO;
import com.jpeccia.ficha_ordem_paranormal_server.repository.SkillRepository;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public List<SkillDTO> getSkillsByCharacterSheetId(Long characterSheetId) {
        return skillRepository.findByCharacterSheetId(characterSheetId).stream()
                .map(skill -> new SkillDTO(
                        skill.getId(),
                        skill.getName(),
                        skill.getDescription(),
                        skill.getBaseAttribute(),
                        skill.isTrained()
                ))
                .toList();
    }
}
