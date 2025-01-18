package com.jpeccia.ficha_ordem_paranormal_server.model.Skill;

import com.jpeccia.ficha_ordem_paranormal_server.model.CharacterSheet.CharacterSheet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String baseAttribute;

    private Boolean trained;

    @ManyToOne
    @JoinColumn(name = "character_sheet_id", nullable = false)
    private CharacterSheet characterSheet;

}
