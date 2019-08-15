package br.com.sotolani.vacinasweb.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@Embeddable
public class FornecedorVacinaPK implements Serializable {

    @Column(name = "ID_FORNECEDOR")
    private Integer idFornecedor;

    @Column(name = "ID_VACINA")
    private Integer idVacina;

}
