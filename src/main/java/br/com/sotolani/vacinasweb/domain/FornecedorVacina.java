package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "TB_FORNECEDOR_VACINA")
public class FornecedorVacina implements Serializable {

    @EmbeddedId
    private FornecedorVacinaPK pk = new FornecedorVacinaPK();

    @ManyToOne
    @JoinColumn(name = "ID_FORNECEDOR", insertable = false, updatable = false)
    private Empresa fornecedor;

    @ManyToOne
    @JoinColumn(name = "ID_VACINA", insertable = false, updatable = false)
    private Vacina vacina;
}
