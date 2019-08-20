package br.com.sotolani.vacinasweb.config.validation;

import br.com.sotolani.vacinasweb.config.validation.dto.ErroDeFormularioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ValidationErrorHandler {

    @Autowired
    private MessageSource messageSource; //Faz a "Traduçao" das mensagens para o idioma local

    // Metodo executado quando houver excecao dentro de um controller
    @ExceptionHandler(MethodArgumentNotValidException.class) //define que o tipo de excecao será de argumento invalido
    @ResponseStatus(code = HttpStatus.BAD_REQUEST) // Define o retorno do Status FIXO como 400, mesmo tratando os erros
    public List<ErroDeFormularioDTO> handle(MethodArgumentNotValidException exception) {

        List<ErroDeFormularioDTO> listErros = new ArrayList<>();
        //Busca a lista de erros retornado na exception
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        fieldErrors.forEach(fieldError -> {
            //LocaleContextHolder - Informa a localidade correta do contexto
            String messageTraduzida = messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());

            listErros.add(new ErroDeFormularioDTO(fieldError.getField(), messageTraduzida));
        });

        return listErros;
    }
}
