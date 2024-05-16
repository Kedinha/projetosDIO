import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

  @Test
  @EnabledIfEnvironmentVariable(named = "USER", matches = "Kedma")
  void validarAlgoSomenteNoUsuarioKed() {
    Assertions.assertEquals(10, 10);
  }

  @Test
  @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
  void naoValidarAlgoSomenteNoUsuarioRoot() {
    Assertions.assertEquals(10, 10);
  }

  @Test
  @EnabledOnOs(OS.LINUX)
  void testaAlgoSeNoSOperacional() {
    Assertions.assertEquals(10, 5 + 5);
  }

  @Test
  @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
  void verVersaoCorrente() {
    Assertions.assertEquals(10, 5 + 5);
  }

}