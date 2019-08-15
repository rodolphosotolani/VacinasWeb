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

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TD_VACINACAO")
public class Vacinacao implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idVacinacao;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_LOTE_VACINA")
    private LoteVacina loteVacina;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_APLICADOR")
    private Funcionario aplicador;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PACIENTE")
    private Paciente paciente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_VACINACAO")
    private Date dataVacinacao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_REGISTRO", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date dataRegistro;

    @ManyToOne
    @JoinColumn(name = "ID_SOLICITANTE")
    private Funcionario medicoSolicitante;

    @Override
    public String toString() {
        return "Vacina " + loteVacina.getVacina().getNome() + " - Paciente " + paciente + " - Data " + dataVacinacao;
    }

}
