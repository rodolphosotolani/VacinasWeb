package br.com.sotolani.vacinasweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class VacinasWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(VacinasWebApplication.class, args);
    }
}
