/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Rodolpho
 */
@Data
@Entity
@Table
@PrimaryKeyJoinColumn(name = "idContato")
public class Contato extends Pessoa implements Serializable {

    @OneToMany(mappedBy = "contato", cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, name = "idEmpresa")
    private Empresa empresa;

}
