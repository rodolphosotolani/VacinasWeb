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
@Table(name = "TB_PERMISSAO")
public class Permissao implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idPermissao;

    @Column(name = "NOME", length = 50)
    private String nome;

    @Column(name = "DESCRICAO", length = 100)
    private String descricao;

    @OneToMany(mappedBy = "permissao")
    private List<PerfilPermissao> perfilPermissaoList;

    @Override
    public String toString() {
        return nome;
    }

}
