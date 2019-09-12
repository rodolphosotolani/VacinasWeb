package br.com.sotolani.vacinasweb.utils;

import org.springframework.stereotype.Component;

import java.time.DateTimeException;
import java.util.Date;
import java.util.Objects;

@Component
public class DateUtils {

    public static Date addTimeToDate(Date data, Long milisseconds) {
        validDate(data);
        return new Date(data.getTime() + milisseconds);
    }

    private static void validDate(Date data) {
        if (Objects.isNull(data))
            throw new DateTimeException("Data inválida!");
    }

    public static Date addTimeToNewDate(Long milisseconds) {
        return new Date(new Date().getTime() + milisseconds);
    }
}
