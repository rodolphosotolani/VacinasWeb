package br.com.sotolani.vacinasweb.controller;

import br.com.sotolani.vacinasweb.controller.dto.TokenDTO;
import br.com.sotolani.vacinasweb.controller.form.LoginForm;
import br.com.sotolani.vacinasweb.service.AutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

    @Autowired
    private AutenticacaoService service;

    @PostMapping
    private ResponseEntity<TokenDTO> autenticar(@RequestBody @Valid LoginForm form) {

        try {
            String token = service.autenticar(form);
            return ResponseEntity.ok(new TokenDTO(token, "Bearer"));
        } catch (AuthenticationException e) {
            return ResponseEntity.badRequest().build();
        }

    }
}
