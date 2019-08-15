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
