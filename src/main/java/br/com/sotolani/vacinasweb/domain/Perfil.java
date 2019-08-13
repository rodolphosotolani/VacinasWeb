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
 * @author Rodolpho
 */
@Data
@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idPerfil;

    @ManyToMany(mappedBy = "listaPerfis")
    private List<Usuario> listaUsuarios;

    @ManyToMany
    private List<Permissao> listaPermissoes;

    @Column(name = "NOME", length = 50)
    private String nome;

    @Column(name = "DESCRICAO", length = 100)
    private String descricao;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @Override
    public String toString() {
        return nome;
    }

}
