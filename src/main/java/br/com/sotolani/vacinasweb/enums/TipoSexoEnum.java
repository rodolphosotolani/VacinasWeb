package br.com.sotolani.vacinasweb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoSexoEnum {

    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");

    private char sigla;
    private String descricao;

    @Override
    public String toString() {
        return String.valueOf(sigla);
    }

}
