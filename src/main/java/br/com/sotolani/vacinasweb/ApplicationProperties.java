package br.com.sotolani.vacinasweb;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ApplicationProperties {

    @Value("#{jwt.expiration.time}")
    public Long timeExpirationJWT;

    @Value("#{jwt.token.secret}")
    public String tokenSecretJWT;

}
