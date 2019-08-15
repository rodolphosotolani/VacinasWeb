/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rodolpho
 */
@Data
@Entity
@Table(name = "TB_FUNCIONARIO")
@PrimaryKeyJoinColumn(name = "idFuncionario")
public class Funcionario extends Pessoa implements Serializable {

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TIPO_FUNCIONARIO", nullable = false)
    private TipoFuncionario tipoFuncionario;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ADMISSAO")
    private Date dataAdmissao;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_DEMISSAO")
    private Date dataDemissao;

    @Column(name = "MATRICULA", length = 50)
    private String matricula;

    @OneToMany(mappedBy = "funcionario")
    private List<Usuario> listaUsuarios;

    @Override
    public String toString() {
        return matricula + " - " + getNome();
    }

}
