package srpingboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import srpingboot.app.ConversorJson;
import srpingboot.app.ViaCepResponse;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
    }

    @Bean // quando não tenho acesso ao codigo fonte e Component é quando é uma classe que
          // tem a finalidade de ser provida pela Injeção de dependencias.
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\",\"localidade\":\"São Paulo\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do CEP" + response);
        };
    }

}