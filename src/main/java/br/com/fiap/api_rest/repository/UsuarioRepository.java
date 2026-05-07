package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Usuario;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UsuarioRepository extends Repository<Usuario, UUID> {
    UserDetails findByLogin(String attr0);

    void save(Usuario novoUsuario);
}


package br.com.fiap.api_rest.controller;

import br.com.fiap.api_rest.model.Usuario;
import org.springframework.data.repository.Repository;

import java.util.UUID;

interface UsuarioRepository extends Repository<Usuario, UUID> {
    boolean findByLogin(String attr0);

    void save(Usuario novoUsuario);
}
