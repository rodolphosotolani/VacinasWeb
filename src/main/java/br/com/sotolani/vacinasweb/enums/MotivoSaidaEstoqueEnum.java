package br.com.sotolani.vacinasweb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MotivoSaidaEstoqueEnum {

    VENCIMENTO("Vencimento", "V"),
    FALTA("Falta", "F"),
    QUEBRA("Quebra", "Q");

    private String descricao;
    private String valor;

}
