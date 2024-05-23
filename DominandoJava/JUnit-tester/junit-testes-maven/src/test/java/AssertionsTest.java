
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.ked.Pessoa;

public class AssertionsTest {
  @Test
  void validarValoresDeOperacoes() {

    /* Validando soma */
    int resultado = 10;
    assertEquals(resultado, (5 + 5));

    /* Validando igualdade de valores */
    double valor = 5.0;
    double outroValor = 5.0;
    assertEquals(valor, outroValor);
  }

  @Test
  void validarSeArraysSaoIguais() {

    /* Valida se os arrays são iguais, comparando um a um */
    int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
    int[] segundoLancamento = { 10, 20, 30, 40, 50 };
    assertArrayEquals(primeiroLancamento, segundoLancamento);

    /* Utilizando arrays de diferentes tipos, começando por boolean[] */
    boolean[] flags = { true, false, false };
    assertArrayEquals(new boolean[] { true, false, false }, flags);

    /* Utilizando arrays de diferentes tipos, começando por double[] */
    double[] valores = { 5.0, 10.5, 50D, 46d };
    assertArrayEquals(new double[] { 5.0, 10.5, 50D, 46d }, valores);
  }

  @Test
  void validarSeObjetoNulo() {

    Pessoa pessoa = null;
    Assertions.assertNull(pessoa);

    pessoa = new Pessoa("Zoe", null, LocalDate.now());

    Assertions.assertNotNull(pessoa);

  }

  @Test
  void validarNumerosDeTiposDiferentes() {
    double valor = 5.0;
    double outroValor = 5.0;

    assertEquals(valor, outroValor);
  }
}
