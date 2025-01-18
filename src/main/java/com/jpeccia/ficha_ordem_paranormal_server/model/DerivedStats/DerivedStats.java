package com.jpeccia.ficha_ordem_paranormal_server.model.DerivedStats;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class DerivedStats {
    private int healthPoints;
    private int sanityPoints;
    private int effortPoints;
    private int defense;
    private int movement;
}
