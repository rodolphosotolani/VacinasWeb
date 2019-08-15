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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PACIENTE")
//@PrimaryKeyJoinColumn(name = "idPaciente")
public class Paciente extends Pessoa implements Serializable {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CADASTRO", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date dataCadastro;

//    @Column(name = "NOME_MAE", length = 50)
@ManyToOne
@JoinColumn(name = "ID_MAE")
private Paciente mae;

//    @Column(name = "NOME_PAI", length = 50)
@ManyToOne
@JoinColumn(name = "ID_PAI")
private Paciente pai;

//    @Column(name = "NOME_RESPONSAVEL", length = 50)
@ManyToOne
@JoinColumn(name = "ID_RESPONSAVEL")
private Paciente responsavel;

}
