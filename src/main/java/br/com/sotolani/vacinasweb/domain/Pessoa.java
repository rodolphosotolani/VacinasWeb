/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import br.com.sotolani.vacinasweb.enums.TipoSexoEnum;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Rodolpho
 */
@Data
@Entity
@Table(name = "TB_PESSOA")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "SEXO", length = 10)
    private TipoSexoEnum sexo;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "CPF", length = 15)
    private String cpf;

    @Column(name = "CELULAR", length = 15)
    private String celular;

    @Column(name = "TELEFONE", length = 15)
    private String telefone;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "ATIVO")
    private Boolean ativo = Boolean.TRUE;

    @Override
    public String toString() {
        return nome;
    }
}
