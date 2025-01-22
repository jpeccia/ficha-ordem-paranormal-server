package com.jpeccia.ficha_ordem_paranormal_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpeccia.ficha_ordem_paranormal_server.model.CharacterClass.CharacterClass;
import com.jpeccia.ficha_ordem_paranormal_server.model.CharacterClass.DTO.CharacterClassDTO;
import com.jpeccia.ficha_ordem_paranormal_server.repository.CharacterClassRepository;

@Service
public class CharacterClassService {
    
    @Autowired
    private CharacterClassRepository characterClassRepository;

    public List<CharacterClassDTO> getAllClasses() {
        return characterClassRepository.findAll().stream().map(characterClass -> new CharacterClassDTO(characterClass.getId(), 
        characterClass.getName(), 
        characterClass.getDescription(), 
        characterClass.getProficiences(), 
        characterClass.getStartingSkills()
        ))
        .toList();
    }

    public CharacterClassDTO getClassById(Long id){
        CharacterClass characterClass = characterClassRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Classe não encontrada"));

        return new CharacterClassDTO(
        characterClass.getId(),
        characterClass.getName(),
        characterClass.getDescription(),
        characterClass.getProficiences(),
        characterClass.getStartingSkills()
        );
    }

}
