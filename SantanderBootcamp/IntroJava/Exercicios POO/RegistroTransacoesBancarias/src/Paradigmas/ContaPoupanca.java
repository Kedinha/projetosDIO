package Paradigmas;

import java.text.DecimalFormat;

class ContaPoupanca extends ContaBancaria {
  private double taxaJuros;

  public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
    super(numero, titular, saldo); // Chama o construtor da classe base
    this.taxaJuros = taxaJuros;
  }

  public void exibirInformacoes() {
    super.exibirInformacoes(); // Chama o método da classe base
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println("Taxa de Juros: " + decimalFormat.format(taxaJuros) + "%");
  }
}