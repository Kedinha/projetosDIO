package com.ked;

public class Conta {

  private String numeroConta;

  private int saldo;

  public Conta(String numeroConta, int saldo) {
    this.numeroConta = numeroConta;
    this.saldo = saldo;
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public int getSaldo() {
    return saldo;
  }

  public void lancaCredito(int valor) {
    this.saldo += valor;
  }

  public void lancaDebito(int valor) {
    this.saldo -= valor;
  }

  public void pagaBoleto(int valorAPagar) {
    validaSaldo(valorAPagar);
    debita(valorAPagar);
    enviaCreditoParaEmissor(valorAPagar);
  }

  public void validaSaldo(int valorAPagar) {
    if (valorAPagar > saldo) {
      throw new IllegalStateException("Saldo insuficiente");
    }
  }

  public void debita(int valorAPagar) {
    this.saldo = this.saldo - valorAPagar;
  }

  public void enviaCreditoParaEmissor(int valorAPagar) {
    // envia valor para emissor do boleto
  }

}
