package br.com.sotolani.vacinasweb.service;

import br.com.sotolani.vacinasweb.ApplicationProperties;
import br.com.sotolani.vacinasweb.domain.Usuario;
import br.com.sotolani.vacinasweb.utils.DateUtils;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    @Autowired
    private ApplicationProperties properties;

    @Autowired
    private UsuarioService usuarioService;

    public String generatedToken(Authentication authentication) {
        Usuario usuarioLogado = (Usuario) authentication.getPrincipal();
        return Jwts.builder()
                .setIssuer("R.T.S. Softwares") //APLICACAO QUE GERA O TOKEN
                .setSubject(usuarioLogado.getIdUsuario().toString()) // USUARIO LOGADO DO TOKEN
                .setIssuedAt(new Date())
                .setExpiration(DateUtils.addTimeToNewDate(properties.getTimeExpirationJWT()))
                .signWith(SignatureAlgorithm.HS256, properties.getTokenSecretJWT())
                .compact();
    }

    public Usuario getUsuarioToken(String token) {
        try {
            String idUsuario = Jwts.parser()
                    .setSigningKey(properties.tokenSecretJWT)
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();

            return usuarioService.findById(Integer.parseInt(idUsuario)).get();
        } catch (Exception e) {
            return null;
        }
    }
}
