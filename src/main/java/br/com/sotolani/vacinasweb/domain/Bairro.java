/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sotolani.vacinasweb.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "TB_BAIRRO")
public class Bairro implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idBairro;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CIDADE", nullable = false)
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
