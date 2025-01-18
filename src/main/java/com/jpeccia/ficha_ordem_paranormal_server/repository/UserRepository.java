package com.jpeccia.ficha_ordem_paranormal_server.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jpeccia.ficha_ordem_paranormal_server.model.User.User;

@Repository
public interface UserRepository {
    Optional<User> findByEmail(String email);
}
