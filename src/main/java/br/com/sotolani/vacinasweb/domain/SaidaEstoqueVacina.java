/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import br.com.sotolani.vacinasweb.enums.MotivoSaidaEstoqueEnum;
import br.com.sotolani.vacinasweb.enums.TipoSaidaEstoqueEnum;
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
@Table(name = "TB_SAIDA_ESTOQUE_VACINA")
public class SaidaEstoqueVacina implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idSaidaEstoque;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ESTOQUE_VACINA", nullable = false, updatable = false)
    private EstoqueVacina estoqueVacina;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_FUNCIONARIO", nullable = false, updatable = false)
    private Funcionario responsavel;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_SAIDA")
    private Date dataSaida;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "TIPO_SAIDA_ESTOQUE", length = 20, nullable = false)
    private TipoSaidaEstoqueEnum tipoSaida;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "MOTIVO_SAIDA", length = 20)
    private MotivoSaidaEstoqueEnum motivoSaidaEstoque;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @Override
    public String toString() {
        return tipoSaida.getDescricao() + " - " + quantidade + " itens.";
    }

}
