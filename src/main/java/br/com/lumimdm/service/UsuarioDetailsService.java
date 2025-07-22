package br.com.lumimdm.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import br.com.lumimdm.model.Usuario;
import br.com.lumimdm.repository.JPAusuario;
import org.springframework.security.core.userdetails.User;
import java.util.ArrayList;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    private final JPAusuario usuarioRepository;

    public UsuarioDetailsService(JPAusuario usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsername(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário não encontrado: " + username);
        }
        return User.builder()
            .username(usuario.getUsername())
            .password(usuario.getPassword())
            .disabled(!usuario.isEnabled())
            .authorities(new ArrayList<>()) // sem roles
            .build();
    }
}
