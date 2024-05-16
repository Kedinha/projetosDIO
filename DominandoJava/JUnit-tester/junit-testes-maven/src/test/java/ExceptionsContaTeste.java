import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ked.Conta;
import com.ked.TransferenciaEntreContas;

public class ExceptionsContaTeste {

  @Test
  void validaExcecaoNaTranferencia() {
    Conta contaOrigem = new Conta("078910", 0);
    Conta contaDestino = new Conta("123456", 100);

    TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
    // Espera exceção lançada
    Assertions.assertThrows(IllegalArgumentException.class,
        () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

  }

  @Test
  void validaValorExcecaoNaTranferencia() {
    Conta contaOrigem = new Conta("078910", 0);
    Conta contaDestino = new Conta("123456", 100);

    // Não espera exceção lançada

    TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
    Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

  }
}