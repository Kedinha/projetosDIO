import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.Random.class)
public class EscolhendoAOrdemTeste {

  // @Order(3)
  @Test
  void validaFluxoA() {
    Assertions.assertTrue(true);
  }

  // @Order(1)
  @Test
  void validaFluxoB() {
    Assertions.assertTrue(true);
  }

  // @Order(2)
  @Test
  void validaFluxoC() {
    Assertions.assertTrue(true);
  }
}
