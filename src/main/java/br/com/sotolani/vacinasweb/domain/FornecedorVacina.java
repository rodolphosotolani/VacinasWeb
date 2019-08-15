package br.com.sotolani.vacinasweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
