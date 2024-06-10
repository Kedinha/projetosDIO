import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

import com.ked.ApiDosCorreios;
import com.ked.CadastrarPessoa;
import com.ked.DadosLocalizacao;
import com.ked.Pessoa;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

  @Mock
  private ApiDosCorreios apiDosCorreios;

  @InjectMocks
  private CadastrarPessoa cadastrarPessoa;

  @Test
  void validardadosDeCadastro() {
    DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MS", "Campo Grande", "Rua America", "Casa", "Planalto");

    Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("7894654")).thenReturn(dadosLocalizacao);
    Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Kedma", "4566644", LocalDate.now(), "7894654");
    assertEquals("Kedma", pessoa.getNome());
    assertEquals(dadosLocalizacao.getCidade(), pessoa.getNome());

    assertEquals("4566644", pessoa.getDocumento());
    assertEquals("MS", pessoa.getEndereco().getUf());
  }

  @Test
  void lancarExceptionQuandoChamrApiCorreios() {
    Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);

    Assertions.assertThrows(IllegalArgumentException.class,
        () -> cadastrarPessoa.cadastrarPessoa("Kedma", "4566644", LocalDate.now(), "7894654"));
  }

  @Test
  void lancarExceptionQuandoqualquerChamrApiCorreios() {

    Mockito.doThrow(IllegalArgumentException.class)
        .when(apiDosCorreios)
        .buscaDadosComBaseNoCep(anyString());

    Assertions.assertThrows(IllegalArgumentException.class,
        () -> cadastrarPessoa.cadastrarPessoa("Kedma", "4566644", LocalDate.now(), "7894654"));
  }
}
