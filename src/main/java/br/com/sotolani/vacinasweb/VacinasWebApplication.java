package br.com.sotolani.vacinasweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication //define que é a classe principal
@EnableSpringDataWebSupport
@EnableWebSecurity // Habilita as configuracoes de segurança
@EnableSwagger2 //Habilita a documentacao pelo Swagger
public class VacinasWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(VacinasWebApplication.class, args);
    }
}
