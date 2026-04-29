package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Usuario;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository {
    UserDetails findByLogin(String username);

    void save(Usuario novoUsuario);
}
