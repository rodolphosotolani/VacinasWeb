package br.com.sotolani.vacinasweb.service;

import br.com.sotolani.vacinasweb.controller.dto.UsuarioDTO;
import br.com.sotolani.vacinasweb.domain.Usuario;
import br.com.sotolani.vacinasweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UsuarioService implements Serializable {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll() {
        return this.repository.findAll();
    }
}
