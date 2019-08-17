package br.com.sotolani.vacinasweb.controller.dto;

import br.com.sotolani.vacinasweb.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    public static List<UsuarioDTO> converter(List<Usuario> usuarioList) {
        return usuarioList.stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }

    public static UsuarioDTO converter(Usuario usuario) {
        return new UsuarioDTO(usuario);
    }
}
