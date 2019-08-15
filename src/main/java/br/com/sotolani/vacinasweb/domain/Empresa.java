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

/**
 * @author Diego
 */
@Data
@Entity
@Table
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idEmpresa;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ID_ENDERECO")
    private Endereco endereco;

    @Column(name = "NOME_FANTASIA", length = 100, nullable = false)
    private String nomeFantasia;

    @Column(name = "RAZAO_SOCIAL", length = 100)
    private String razaoSocial;

    @Column(name = "CNPJ", length = 20)
    private String CNPJ;

    @Column(name = "TELEFONE", length = 15)
    private String telefone;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "FORNECEDOR")
    private boolean fornecedor;

    @Column(name = "FABRICANTE")
    private boolean fabricante;

    @Column(name = "PARCEIRA")
    private boolean parceira;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Contato> contatoList;

    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
    private List<FornecedorVacina> fornecedorVacinaList;

    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
    private List<FabricanteVacina> fabricanteVacinaList;

    @Override
    public String toString() {
        return nomeFantasia + " - " + razaoSocial + " - " + CNPJ;
    }

}
