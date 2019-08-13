package br.com.sotolani.vacinasweb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoSaidaEnum {

    VENDA("Venda", "V"),
    APLICACAO("Aplicação", "A"),
    PERDA("Perda", "P");

    private String Descricao;
    private String valor;

    @Override
    public String toString() {
        return valor;
    }

}
