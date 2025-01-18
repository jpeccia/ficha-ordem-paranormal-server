package com.jpeccia.ficha_ordem_paranormal_server.model.Attributes;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Attributes {
    private int agility;
    private int strength;
    private int intellect;
    private int presence;
    private int vigor;
}
