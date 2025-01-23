package com.jpeccia.ficha_ordem_paranormal_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpeccia.ficha_ordem_paranormal_server.model.Ritual.DTO.RitualDTO;
import com.jpeccia.ficha_ordem_paranormal_server.repository.RitualRepository;

@Service
public class RitualService {

    @Autowired
    private RitualRepository ritualRepository;

    public List<RitualDTO> getRitualsByCharacterSheetId(Long characterSheetId) {
        return ritualRepository.findByCharacterSheetId(characterSheetId).stream()
                .map(ritual -> new RitualDTO(
                        ritual.getId(),
                        ritual.getName(),
                        ritual.getType(),
                        ritual.getCircle(),
                        ritual.getRange(),
                        ritual.getTarget(),
                        ritual.getDuration(),
                        ritual.getResistance()
                ))
                .toList();
    }
}
