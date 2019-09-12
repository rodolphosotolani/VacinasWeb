package br.com.sotolani.vacinasweb.service;

import br.com.sotolani.vacinasweb.domain.Usuario;
import br.com.sotolani.vacinasweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements Serializable, UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll() {
        return this.repository.findAll();
    }

    public Usuario findByLogin(String login) {
        return this.repository.findByLogin(login);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.findByLogin(username);
    }

    public Optional<Usuario> findById(int idUsuario) {
        return this.repository.findById(idUsuario);
    }
}
