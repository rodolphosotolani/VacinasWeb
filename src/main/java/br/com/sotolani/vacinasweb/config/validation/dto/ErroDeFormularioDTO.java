package br.com.sotolani.vacinasweb.config.validation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErroDeFormularioDTO {

    private String campo;
    private String mensagem;

}
