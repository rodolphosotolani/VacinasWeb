package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
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
