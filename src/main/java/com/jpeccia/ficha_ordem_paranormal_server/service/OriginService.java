package com.jpeccia.ficha_ordem_paranormal_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpeccia.ficha_ordem_paranormal_server.model.Origin.Origin;
import com.jpeccia.ficha_ordem_paranormal_server.model.Origin.DTO.OriginDTO;
import com.jpeccia.ficha_ordem_paranormal_server.repository.OriginRepository;

@Service
public class OriginService {
    
    @Autowired
    private OriginRepository originRepository;

    public List<OriginDTO> getAllOrigins(){
        return originRepository.findAll().stream()
        .map(origin -> new OriginDTO(origin.getId(),
        origin.getName(),
        origin.getDescription(),
        origin.getBenefits()
        ))
        .toList();
    }

    public OriginDTO getOriginByID(Long id){
        Origin origin = originRepository.findById(id).orElseThrow(() -> new RuntimeException("Origem não encontrada"));
        return new OriginDTO(origin.getId(), origin.getName(), origin.getDescription(), origin.getBenefits());
    }

}
