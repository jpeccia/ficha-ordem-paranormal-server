package com.jpeccia.ficha_ordem_paranormal_server.model.Path;

import java.util.List;

import com.jpeccia.ficha_ordem_paranormal_server.model.CharacterClass.CharacterClass;

import jakarta.persistence.ElementCollection;
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
public class Path {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private CharacterClass characterClass;

    @ElementCollection
    private List<String> abilities;
}
