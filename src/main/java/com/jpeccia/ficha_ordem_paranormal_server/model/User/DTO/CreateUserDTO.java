package com.jpeccia.ficha_ordem_paranormal_server.model.User.DTO;

public record CreateUserDTO(
     String username,
     String email,
     String password
) {}
