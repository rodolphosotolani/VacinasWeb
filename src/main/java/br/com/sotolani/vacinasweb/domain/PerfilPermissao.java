package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_PERFIL_PERMISSAO")
public class PerfilPermissao {

    @EmbeddedId
    private PerfilPermissaoPK pk = new PerfilPermissaoPK();

    @ManyToOne
    @JoinColumn(name = "ID_PERFIL", insertable = false, updatable = false)
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "ID_PERMISSAO", insertable = false, updatable = false)
    private Permissao permissao;

}
