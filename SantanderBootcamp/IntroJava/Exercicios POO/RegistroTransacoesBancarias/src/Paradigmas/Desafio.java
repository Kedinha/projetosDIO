package Paradigmas;

import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o nome do titular da conta: ");
    String titular = scanner.next();

    System.out.print("Informe o o número da conta: ");
    int numeroConta = scanner.nextInt();

    System.out.print("Saldo inicial da conta ");
    double saldo = scanner.nextDouble();

    System.out.print("Taxa de juros da conta poupança ");
    double taxaJuros = scanner.nextDouble();

    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

    System.out.println("Conta Poupanca:");
    contaPoupanca.exibirInformacoes();

    scanner.close();
  }

}
