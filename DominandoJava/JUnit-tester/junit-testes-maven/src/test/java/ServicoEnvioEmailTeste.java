import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ked.Email;
import com.ked.Formato;
import com.ked.PlataformaDeEnvio;
import com.ked.ServicoEnvioEmail;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

  @Mock
  private PlataformaDeEnvio plataforma;

  @InjectMocks
  private ServicoEnvioEmail servico;

  @Captor
  private ArgumentCaptor<Email> captor;

  @Test
  void validarDadosEnviadosParaPlataforma() {

    String enderecoEmail = "usuario@testked.com.br";
    String mensagem = "Seja Bem vindo a nossa Plataforma";
    boolean formatoHtml = true; // Espera o formato HTML

    servico.enviaEmail(enderecoEmail, mensagem, formatoHtml);

    Mockito.verify(plataforma).enviaEmail(captor.capture());

    Email emailCapturado = captor.getValue();

    Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
    Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
    Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());

  }

}
