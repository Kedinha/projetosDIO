import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ked.BancoDeDados;
import com.ked.Pessoa;

/* @BeforeAll é executado antes de todos os testes, e o método com @AfterAll
  * @BeforeEach é executado antes de cada teste, e o método anotado com @AfterEach, após cada teste.
*/
public class ConsultarDadosPessoaTest {

  @BeforeAll // uma execução unica
  static void configuraConexao() {
    BancoDeDados.iniciarConexao();
    System.out.println("Rodando configurar conexão");
  }

  @BeforeEach // antes de cada teste da classe
  void insereDadosParaTeste() {
    BancoDeDados.insereDados(new Pessoa("Levi", "123", LocalDate.of(2000, 12, 21)));
  }

  @AfterEach
  void removeDadosTeste() {
    BancoDeDados.removeDados(new Pessoa("Levi", "456", LocalDate.of(2000, 12, 21)));
  }

  @Test
  void validardadosDeRetorno() {
    Assertions.assertTrue(true);
  }

  @AfterAll
  static void finalizarConexao() {
    BancoDeDados.finalizarConexao();
    System.out.println("Rodou finalizar Conexao");
  }

}
