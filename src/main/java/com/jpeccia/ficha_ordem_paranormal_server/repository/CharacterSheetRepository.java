package com.jpeccia.ficha_ordem_paranormal_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpeccia.ficha_ordem_paranormal_server.model.CharacterSheet.CharacterSheet;

@Repository
public interface CharacterSheetRepository extends JpaRepository<CharacterSheet, Long> {
    List<CharacterSheet> findByUserId(Long userId);
}
