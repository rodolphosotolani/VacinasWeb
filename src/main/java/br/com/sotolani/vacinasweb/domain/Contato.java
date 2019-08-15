/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Rodolpho
 */
@Data
@Entity
@Table
//@PrimaryKeyJoinColumn(name = "ID_CONTATO")
public class Contato extends Pessoa implements Serializable {

    @ManyToOne
    @JoinColumn(name = "ID_EMPRESA", nullable = false)
    private Empresa empresa;

}
