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
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_ESTOQUE_VACINA")
public class EstoqueVacina implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer idEstoqueVacina;

    @Column(name = "QUANTIDADE_ENTRADA")
    private Integer quantidadeEntrada;

    @Column(name = "QUANTIDADE_SAIDA")
    private Integer quantidadeSaida;

    @Column(name = "QUANTIDADE_ATUAL")
    private Integer quantidadeAtual;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CADASTRO", nullable = false,
            updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date dataCadastro;

    @OneToMany(mappedBy = "estoqueVacina")
    private List<LoteVacina> loteVacinaList;

    @OneToMany(mappedBy = "estoqueVacina")
    private List<EntradaEstoqueVacina> listaEntradasEstoque;

    @OneToMany(mappedBy = "estoqueVacina")
    private List<SaidaEstoqueVacina> ListaSaidasEstoque;

}
