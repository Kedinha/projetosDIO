import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Saldo inicial
    System.out.print("Informe o saldo inicial da conta: ");
    double saldo = scanner.nextDouble();

    // Quantidade de transacoes
    System.out.print("Informe a quantidade de transacoes: ");
    int quantidadeTransacoes = scanner.nextInt();
    List<Transacao> transacoes = new ArrayList<>();

    for (int i = 1; i <= quantidadeTransacoes; i++) {
      System.out.print("Informe o tipo da transação: ");
      char tipoTransacao = scanner.next().charAt(0);
      System.out.print("Informe o Valor da transação: ");
      double valorTransacao = scanner.nextDouble();

      Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
      transacoes.add(transacao);

      // Aqui é atualizado o saldo da conta com base no tipo de transação
      if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
        saldo += valorTransacao;
      } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
        saldo -= valorTransacao;
      }
    }

    // Exibe o saldo final e a lista de transações ao final do processo usando
    // Stream API
    System.out.println("\nSaldo de: " + saldo);
    System.out.println("\nTransacoes:");

    // Crie um fluxo (stream) a partir da lista de transações:
    transacoes.stream()

        // Mapeie cada transação para uma string formatada:
        .map(transacao -> formatarTransacao(transacao))

        // Colete os elementos do fluxo em uma lista:

        .collect(Collectors.toList())

        // Para cada elemento da lista, imprime no console:
        .forEach(System.out::println);

    scanner.close();
  }

  private static String formatarTransacao(Transacao transacao) {
    return transacao.getTipo() + ". " +
        (transacao.getTipo() == 'D' || transacao.getTipo() == 'd' ? "Deposito de " : "Saque de ") +
        transacao.getValor();
  }
}

class Transacao {
  private char tipo;
  private double valor;

  public Transacao(char tipo, double valor) {
    this.tipo = tipo;
    this.valor = valor;
  }

  public char getTipo() {
    return tipo;
  }

  public double getValor() {
    return valor;
  }
}
