package br.com.sotolani.vacinasweb.service;

import br.com.sotolani.vacinasweb.controller.form.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class AutenticacaoService {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private TokenService tokenService;


    public String autenticar(@Valid LoginForm form) {
        UsernamePasswordAuthenticationToken dadosLogin = form.converter();
        Authentication authentication = authManager.authenticate(dadosLogin);
        return tokenService.generatedToken(authentication);
    }
}
