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
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_VACINA")
public class Vacina implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idVacina;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "USO_ADULTO")
    private Boolean usoAdulto;

    @Column(name = "USO_INFANTIL")
    private Boolean usoInfantil;

    @Column(name = "PRECO_VENDA")
    private Double precoVenda;

    @Column(name = "QUANTIDADE")
    private Integer quantidadeMinima;

    @OneToMany(mappedBy = "vacina")
    private List<FabricanteVacina> fabricanteVacinaList;

    @OneToMany(mappedBy = "vacina")
    private List<FornecedorVacina> fornecedorVacinaList;

    @Override
    public String toString() {
        return nome;
    }

}
