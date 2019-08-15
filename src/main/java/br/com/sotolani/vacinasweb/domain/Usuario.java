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
 *
 * @author Rodolpho
 */
@Data
@Entity
@Table(name = "TB_USUARIO")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idUsuario;

    @ManyToOne
    @JoinColumn(name = "ID_FUNCIONARIO")
    private Funcionario funcionario;

    @Column(name = "LOGIN", length = 50, nullable = false, unique = true)
    private String login;

    @Column(name = "SENHA", length = 150, nullable = false)
    private String senha;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @Column(name = "ADMINISTRADOR")
    private Boolean administrador;

    @OneToMany(mappedBy = "usuario")
    private List<UsuarioPerfil> usuarioPerfilList;

    @Override
    public String toString() {
        return login;
    }

}
