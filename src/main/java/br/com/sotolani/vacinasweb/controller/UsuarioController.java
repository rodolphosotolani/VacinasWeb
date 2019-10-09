package br.com.sotolani.vacinasweb.controller;

import br.com.sotolani.vacinasweb.controller.dto.UsuarioDTO;
import br.com.sotolani.vacinasweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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

    /**
     * @Valid - Define que este parametro deve passar pela validacao do BeansValidation
     * @RequestBody - Define que esta parametro estará no corpo da requisicao.
     */
    @GetMapping("/usuarios/{login}")
    public UsuarioDTO findByLogin(@RequestParam @Valid String login) {
        return UsuarioDTO.converter(service.findByLogin(login));
    }
}

