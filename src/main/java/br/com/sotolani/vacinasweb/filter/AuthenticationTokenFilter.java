package br.com.sotolani.vacinasweb.filter;

import br.com.sotolani.vacinasweb.domain.Usuario;
import br.com.sotolani.vacinasweb.service.TokenService;
import br.com.sotolani.vacinasweb.utils.StringUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

public class AuthenticationTokenFilter extends OncePerRequestFilter {

    private TokenService tokenService;

    public AuthenticationTokenFilter(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {
        //Força a Autenticacao do Spring
        autenticarUsuario(request);
        // libera o request para prosseguir
        filterChain.doFilter(request, response);
    }

    private void autenticarUsuario(HttpServletRequest request) {
        //Buscar o Token do cabeçalho
        String token = recuperarToken(request);
        //Validar o Token
        Usuario usuario = tokenService.getUsuarioToken(token);
        if (Objects.nonNull(usuario)) {
            //Autenticar Usuario no Spring
            UsernamePasswordAuthenticationToken authentication =
                    new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
    }

    private String recuperarToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (StringUtils.validateString(token) && token.startsWith("Bearer "))
            return token.substring(7, token.length());

        return null;
    }
}
