/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Diego
 */
@Data
@Entity
@Table(name = "CIDADE")
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idCidade;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEstado", nullable = false)
    private Estado estado;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "SIGLA", length = 5)
    private String sigla;

    @Override
    public String toString() {
        return nome + " - " + estado.getSigla();
    }

}
