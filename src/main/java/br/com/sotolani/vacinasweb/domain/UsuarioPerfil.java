package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_USUARIO_PERFIL")
public class UsuarioPerfil {

    @EmbeddedId
    private UsuarioPerfilPK pk = new UsuarioPerfilPK();

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_PERFIL", insertable = false, updatable = false)
    private Perfil perfil;

}
