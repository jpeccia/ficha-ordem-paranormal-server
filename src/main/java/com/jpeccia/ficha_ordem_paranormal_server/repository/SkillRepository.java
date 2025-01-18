package com.jpeccia.ficha_ordem_paranormal_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpeccia.ficha_ordem_paranormal_server.model.Skill.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    List<Skill> findByCharacterSheetId(Long characterSheetId);
}
