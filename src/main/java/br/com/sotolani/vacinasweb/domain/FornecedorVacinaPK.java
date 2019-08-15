package br.com.sotolani.vacinasweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class FornecedorVacinaPK implements Serializable {

    @Column(name = "ID_FORNECEDOR")
    private Integer idFornecedor;

    @Column(name = "ID_VACINA")
    private Integer idVacina;

}
