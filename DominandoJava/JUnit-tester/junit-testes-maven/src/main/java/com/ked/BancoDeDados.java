package com.ked;

import java.util.logging.Logger;

public class BancoDeDados {

  private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

  public static void iniciarConexao() {
    // faz algo
    LOGGER.info("Iniciou Conexão");
  }

  public static void finalizarConexao() {
    // fez algo
    LOGGER.info("Finalizou a conexão");
  }

  public static void insereDados(Pessoa pessoa) {
    // insere pessoa no DB
    LOGGER.info("inseriu dados");
  }

  public static void removeDados(Pessoa pessoa) {
    // remove pessoa no DB
    LOGGER.info("removeu dados");
  }

}
