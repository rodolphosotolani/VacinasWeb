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
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idPerfil;

    @Column(name = "NOME", length = 50)
    private String nome;

    @Column(name = "DESCRICAO", length = 100)
    private String descricao;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @OneToMany(mappedBy = "perfil")
    private List<UsuarioPerfil> usuarioPerfilList;

    @OneToMany(mappedBy = "perfil")
    private List<PerfilPermissao> perfilPermissaoList;

}
