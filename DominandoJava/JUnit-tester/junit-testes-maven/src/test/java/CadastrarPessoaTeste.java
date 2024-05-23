// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    assertEquals("4566644", pessoa.getDocumento());
    assertEquals("MS", pessoa.getEndereco().getUf());
  }

}
