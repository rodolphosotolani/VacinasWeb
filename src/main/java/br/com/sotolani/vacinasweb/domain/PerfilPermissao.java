package br.com.sotolani.vacinasweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PERFIL_PERMISSAO")
public class PerfilPermissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer idPerfilPermissao;

    @ManyToOne
    @JoinColumn(name = "ID_PERFIL", nullable = false)
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "ID_PERMISSAO", nullable = false)
    private Permissao permissao;

}
