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
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author Rodolpho
 */
@Data
@Entity
@Table(name = "TB_PERMISSAO")
public class Permissao implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idPermissao;

    @ManyToMany(mappedBy = "listaPermissoes")
    private List<Perfil> listaPerfis;

    @Column(name = "NOME", length = 50)
    private String nome;

    @Column(name = "DESCRICAO", length = 100)
    private String descricao;

    @Override
    public String toString() {
        return nome;
    }

}
