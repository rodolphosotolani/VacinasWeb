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
public class FabricanteVacinaPK implements Serializable {

    @Column(name = "ID_FABRICANTE")
    private Integer idFabricante;

    @Column(name = "ID_VACINA")
    private Integer idVacina;

}
