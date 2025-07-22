package br.com.lumimdm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.lumimdm.model.Usuario;

public interface JPAusuario extends JpaRepository<Usuario, String> {
    Usuario findByUsername(String username);
}