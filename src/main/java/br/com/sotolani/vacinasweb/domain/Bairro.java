/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Diego
 */
@Data
@Entity
@Table(name = "BAIRRO")
public class Bairro implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idBairro;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCidade", nullable = false)
    private Cidade cidade;

    @Column(name = "NOME",length = 100, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "bairro")
    private List<Endereco> listaEnderecos;

    @Override
    public String toString() {
        return nome + " - " + cidade.getNome();
    }
}
