package br.com.sotolani.vacinasweb.controller.dto;

import br.com.sotolani.vacinasweb.domain.Usuario;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<UsuarioDTO> converter(List<Usuario> usuarioList) {
        return usuarioList.stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }

    public UsuarioDTO converter(Usuario usuario) {
        return new UsuarioDTO(usuario);
    }
}
