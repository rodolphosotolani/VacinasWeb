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

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer idEndereco;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "NUMERO", length = 10)
    private String numero;

    @Column(name = "CEP", length = 15)
    private String cep;

    @Column(name = "COMPLEMENTO", length = 100)
    private String complemento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_BAIRRO")
    private Bairro bairro;

    @Override
    public String toString() {
        return nome + ", Nº " + numero;
    }

}
