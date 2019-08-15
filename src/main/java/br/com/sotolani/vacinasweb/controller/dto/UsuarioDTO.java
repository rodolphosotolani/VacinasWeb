package br.com.sotolani.vacinasweb.controller.dto;

import br.com.sotolani.vacinasweb.domain.Usuario;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class UsuarioDTO {

    private Integer idUsuario;

    private String login;

    private String senha;

    private Boolean ativo;

    private Boolean administrador;

    public UsuarioDTO(Usuario usuario) {

        this.idUsuario = usuario.getIdUsuario();
        this.login = usuario.getLogin();
        this.senha = usuario.getSenha();
        this.ativo = usuario.isAtivo();
        this.administrador = usuario.isAdministrador();
    }
}
