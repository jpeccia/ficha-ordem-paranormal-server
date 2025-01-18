package com.jpeccia.ficha_ordem_paranormal_server.model.DerivedStats.DTO;

public record DerivedStatsDTO(
    int healthPoints,
    int sanityPoints,
    int effortPoints,
    int defense,
    int movement
) {}
