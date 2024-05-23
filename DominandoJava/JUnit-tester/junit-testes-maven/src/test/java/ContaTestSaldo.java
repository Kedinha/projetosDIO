import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ked.Conta;

public class ContaTestSaldo {
  @Test
  void validaSaldo() {
    Conta conta = new Conta("123456", 100);
    Assertions.assertNotNull(conta);

    conta.lancaCredito(50);

    Assertions.assertEquals(150, conta.getSaldo());

    conta.lancaDebito(50);

    Assertions.assertEquals(100, conta.getSaldo());

    Assertions.assertNotEquals(101, conta.getSaldo());

    conta = null;
    Assertions.assertNull(conta);
  }

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
  void validarLancamentos() {

    int[] primeiroLancamento = { 50, 60, 80, 90 };
    int[] segundoLancamento = { -50, 600, 820, 90 };

    // Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
  }
}
