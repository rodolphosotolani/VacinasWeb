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
import java.math.BigDecimal;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name = "TB_ENTRADA_ESTOQUE_VACINA")
public class EntradaEstoqueVacina implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idEntradaEstoque;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ESTOQUE_VACINA", nullable = false, updatable = false)
    private EstoqueVacina estoqueVacina;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ENTRADA")
    private Date dataEntrada;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PEDIDO")
    private Date dataPedido;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CADASTRO", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date dataCadastro;

    @Column(name = "NUMERO_NOTA_FISCAL", length = 20)
    private String numeroNotaFiscal;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    @Column(name = "VALOR_TOTAL")
    private BigDecimal valorTotal;

    @Column(name = "VALOR_UNITARIO")
    private BigDecimal valorUnitario;

    @Column(name = "VALOR_DESCONTO")
    private BigDecimal valorDesconto;

    @Column(name = "OBSERVACAO", length = 100)
    private String observacao;

    @ManyToOne()
    @JoinColumn(name = "ID_FORNECEDOR")
    private FornecedorVacina fornecedorVacina;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_FUNCIONARIO", updatable = false, nullable = false)
    private Funcionario responsavel;

    @Override
    public String toString() {
        return "Data Entrada " + dataEntrada + " - Quantidade " + quantidade;
    }

}
