import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ked.Pessoa;

public class PessoaTest {

  @Test
  void validarCalculoDeIdade() {
    Pessoa pessoa = new Pessoa("Ana", null, LocalDate.of(2020, 1, 1));
    Assertions.assertEquals(4, pessoa.getIdade());
  }

  @Test
  void deveCalcularIdadeCorretamente() {
    Pessoa kedma = new Pessoa("Kédma", null, LocalDate.of(1976, 12, 21));
    Assertions.assertEquals(47, kedma.getIdade());

  }

  @Test // --> Anotação é primordial para testar
  void deveRetornarSeMaiorIdade() {
    // --> criação do cenário
    Pessoa kedma = new Pessoa("Kedinha", null, LocalDate.of(2000, 1, 1));
    // --> Executa a validação do teste
    Assertions.assertTrue(kedma.eMaiorIdade());

    Pessoa levi = new Pessoa("Levi", null, LocalDate.of(2020, 1, 1));
    Assertions.assertFalse(levi.eMaiorIdade());
  }
}
