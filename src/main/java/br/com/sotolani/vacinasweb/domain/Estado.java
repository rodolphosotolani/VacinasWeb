/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Diego
 */
@Data
@Entity
@Table(name = "TB_ESTADO")
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idEstado;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "SIGLA", length = 3, nullable = false)
    private String sigla;

    @Override
    public String toString() {
        return sigla + " - " + nome;
    }

}
