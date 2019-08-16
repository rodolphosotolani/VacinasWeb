package br.com.sotolani.vacinasweb.controller;

import br.com.sotolani.vacinasweb.controller.dto.UsuarioDTO;
import br.com.sotolani.vacinasweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @RequestMapping("/usuarios")
    public List<UsuarioDTO> getAll() {
        return UsuarioDTO.converter(this.service.findAll());
    }
}
