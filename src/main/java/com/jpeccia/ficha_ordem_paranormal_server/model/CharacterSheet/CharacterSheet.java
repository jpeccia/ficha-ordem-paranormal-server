package com.jpeccia.ficha_ordem_paranormal_server.model.CharacterSheet;

import java.util.ArrayList;
import java.util.List;

import com.jpeccia.ficha_ordem_paranormal_server.model.Attributes.Attributes;
import com.jpeccia.ficha_ordem_paranormal_server.model.CharacterClass.CharacterClass;
import com.jpeccia.ficha_ordem_paranormal_server.model.DerivedStats.DerivedStats;
import com.jpeccia.ficha_ordem_paranormal_server.model.InventoryItem.InventoryItem;
import com.jpeccia.ficha_ordem_paranormal_server.model.Path.Path;
import com.jpeccia.ficha_ordem_paranormal_server.model.Ritual.Ritual;
import com.jpeccia.ficha_ordem_paranormal_server.model.Skill.Skill;
import com.jpeccia.ficha_ordem_paranormal_server.model.User.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterSheet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String name;
    private String description;

    @Lob
    private byte[] image;

    @Embedded
    private Attributes attributes;

    @Embedded
    private DerivedStats derivedStats;

    private int nex;
    
    @ManyToOne
    @JoinColumn(name = "origin_id")
    private CharacterClass characterClass;

    @ManyToOne
    @JoinColumn(name = "path_id")
    private Path path;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Skill> skills = new ArrayList<>();

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ritual> rituals = new ArrayList<>();

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InventoryItem> inventory = new ArrayList<>();


}
