import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saldo inicial
        System.out.print("Informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Quantidade de transações
        System.out.print("Informe a quantidade de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Processamento de transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Tipo da transação (D para depósito, S para saque)
            String tipoTransacao = scanner.next().toUpperCase();

            // Valor da transação
            double valorTransacao = scanner.nextDouble();

            // Atualização do saldo e adição da transação à lista
            if (tipoTransacao.equals("D")) {
                saldo += valorTransacao;
                transacoes.add(i + ". Depósito de" + valorTransacao);
            } else if (tipoTransacao.equals("S")) {
                saldo -= valorTransacao;
                transacoes.add(i + ". Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o contador para repetir a transação
            }
        }

        // Exibição do saldo final e das transações
        System.out.println("\nSaldo final: " + saldo);
        System.out.println("\nTransações:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }

        scanner.close();
    }
}
