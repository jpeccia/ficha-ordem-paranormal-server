package com.jpeccia.ficha_ordem_paranormal_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpeccia.ficha_ordem_paranormal_server.model.Origin.Origin;

@Repository
public interface OriginRepository extends JpaRepository<Origin, Long> {
}
