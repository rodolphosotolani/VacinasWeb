package br.com.sotolani.vacinasweb.utils;

import java.util.Objects;

public class StringUtils {

    public static boolean validateString(String token) {
        if (Objects.isNull(token) || token.isEmpty())
            return false;

        return true;
    }
}
