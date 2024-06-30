package main.java.firstStep.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

public class Beans {
  @Bean
  @Scope("prototype")
  public Remetente remetente() {
    System.out.println("CRIANDO UM OBJETO REMETENTE");
    Remetente remetente = new Remetente();
    remetente.setEmail("learnked@gmail.com");
    remetente.setNome("Digital Ked");
    return remetente;
  }
}
