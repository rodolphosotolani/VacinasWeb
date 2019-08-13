/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rodolpho.sotolani
 */
@Data
@Entity
@Table(name = "TB_ESTOQUE_VACINA")
public class EstoqueVacina implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idEstoqueVacina;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idLoteVacina", nullable = false, unique = true)
    private LoteVacina loteVacina;

    @ManyToOne
    @JoinColumn(name = "idFornecedor")
    private Empresa fornecedor;

    @Column(name = "QUANTIDADE_ENTRADA")
    private Integer quantidadeEntrada;

    @Column(name = "QUANTIDADE_SAIDA")
    private Integer quantidadeSaida;

    @Column(name = "QUANTIDADE_ATUAL")
    private Integer quantidadeAtual;

    @OneToMany(mappedBy = "estoqueVacina")
    private List<EntradaEstoqueVacina> listaEntradasEstoque;

    @OneToMany(mappedBy = "estoqueVacina")
    private List<SaidaEstoqueVacina> ListaSaidasEstoque;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CADASTRO", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date dataCadastro;

    @Override
    public String toString() {
        return "Vacina " + loteVacina.getVacina() + " - Qtde Atual " + quantidadeAtual;
    }

}
