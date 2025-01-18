package com.jpeccia.ficha_ordem_paranormal_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpeccia.ficha_ordem_paranormal_server.model.Ritual.Ritual;

@Repository
public interface RitualRepository extends JpaRepository<Ritual, Long> {
    List<Ritual> findByCharacterSheetId(Long characterSheetId);
}
