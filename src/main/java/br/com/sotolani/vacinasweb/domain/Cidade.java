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

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CIDADE")
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer idCidade;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_ESTADO", nullable = false)
    private Estado estado;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "SIGLA", length = 5)
    private String sigla;

}
