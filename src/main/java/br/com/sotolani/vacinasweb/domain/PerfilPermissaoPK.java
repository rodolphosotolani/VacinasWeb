package br.com.sotolani.vacinasweb.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@Embeddable
public class PerfilPermissaoPK implements Serializable {

    @Column(name = "ID_PERFIL")
    private Integer idPerfil;

    @Column(name = "ID_PERMISSAO")
    private Integer idPermissao;

}
