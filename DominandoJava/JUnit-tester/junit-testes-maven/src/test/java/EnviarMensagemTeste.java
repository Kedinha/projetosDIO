import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ked.EnviarMensagem;
import com.ked.Mensagem;

@ExtendWith(MockitoExtension.class)

public class EnviarMensagemTeste {

  @Spy
  private EnviarMensagem enviarMensagem = new EnviarMensagem();

  @Test
  void verificarComportamentoDaClasse() {
    Mockito.verifyNoInteractions(enviarMensagem);

    Mensagem mensagem = new Mensagem("Hello world!");
    enviarMensagem.adicionarMensagem(mensagem);

    Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

    Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
  }
}
