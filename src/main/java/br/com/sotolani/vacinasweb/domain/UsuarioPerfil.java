package br.com.sotolani.vacinasweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
