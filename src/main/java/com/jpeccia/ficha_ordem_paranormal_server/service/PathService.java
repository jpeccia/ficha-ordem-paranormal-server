package com.jpeccia.ficha_ordem_paranormal_server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpeccia.ficha_ordem_paranormal_server.model.Path.Path;
import com.jpeccia.ficha_ordem_paranormal_server.model.Path.DTO.PathDTO;
import com.jpeccia.ficha_ordem_paranormal_server.repository.PathRepository;

@Service
public class PathService {

    @Autowired
    private PathRepository pathRepository;

    public List<PathDTO> getAllPaths() {
        return pathRepository.findAll().stream()
                .map(path -> new PathDTO(
                        path.getId(),
                        path.getName(),
                        path.getDescription(),
                        path.getAbilities()
                ))
                .toList();
    }

    public PathDTO getPathById(Long id) {
        Path path = pathRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trilha não encontrada."));
        return new PathDTO(
                path.getId(),
                path.getName(),
                path.getDescription(),
                path.getAbilities()
        );
    }
}
