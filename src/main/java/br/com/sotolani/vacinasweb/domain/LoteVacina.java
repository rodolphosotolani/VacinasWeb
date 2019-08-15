/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_LOTE_VACINA")
public class LoteVacina implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idLoteVacina;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_VACINA", nullable = false)
    private Vacina vacina;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_FABRICANTE", nullable = false)
    private FabricanteVacina fabricante;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ESTOQUE_VACINA", nullable = false)
    private EstoqueVacina estoqueVacina;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_FABRICACAO", nullable = false)
    private Date dataFabricacao;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_VALIDADE", nullable = false)
    private Date dataValidade;

    @Column(name = "DESCRICAO", length = 100)
    private String descricao;

    @Column(name = "NUMERO", length = 20, nullable = false, unique = true)
    private String numero;

    @Column(name = "ATIVO")
    private boolean ativo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CADASTRO", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date dataCadastro;

    @Override
    public String toString() {
        return vacina.getNome() + " - " + numero;
    }

}
