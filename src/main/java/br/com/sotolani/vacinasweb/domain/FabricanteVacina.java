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
@Table(name = "TB_FABRICANTE_VACINA")
public class FabricanteVacina implements Serializable {

    @EmbeddedId
    private FabricanteVacinaPK pk = new FabricanteVacinaPK();

    @ManyToOne
    @JoinColumn(name = "ID_FABRICANTE", insertable = false, updatable = false)
    private Empresa fabricante;

    @ManyToOne
    @JoinColumn(name = "ID_VACINA", insertable = false, updatable = false)
    private Vacina vacina;
}
