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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer idFabricanteVacina;

    @ManyToOne
    @JoinColumn(name = "ID_FABRICANTE", nullable = false)
    private Empresa fabricante;

    @ManyToOne
    @JoinColumn(name = "ID_VACINA", nullable = false)
    private Vacina vacina;
}
