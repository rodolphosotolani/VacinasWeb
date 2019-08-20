package br.com.sotolani.vacinasweb.controller;

import br.com.sotolani.vacinasweb.controller.dto.UsuarioDTO;
import br.com.sotolani.vacinasweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/usuarios")
    public List<UsuarioDTO> findAll() {
        return UsuarioDTO.converter(this.service.findAll());
    }

    @GetMapping("/usuarios")
    public UsuarioDTO findByLogin(String login) {
        return UsuarioDTO.converter(service.findByLogin(login));
    }
}

