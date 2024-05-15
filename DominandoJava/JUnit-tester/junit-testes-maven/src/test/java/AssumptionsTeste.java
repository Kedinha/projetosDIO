
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/* Teste de Suposição - só será executado em determinada  condição for esperada */
public class AssumptionsTeste {

  @Test
  void validarAlgoSomenteNoUsuarioKed() {
    Assumptions.assumeFalse("kedma".equals(System.getenv("USER")));
    Assertions.assertEquals(10, 10);
  }
}
