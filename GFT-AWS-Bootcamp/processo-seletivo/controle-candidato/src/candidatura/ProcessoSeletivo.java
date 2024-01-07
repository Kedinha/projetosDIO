package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

  public static void main(String[] args) {
    // Metodo
    /*
     * analisarCandidato(1900.0);
     * analisarCandidato(2200.0);
     * analisarCandidato(2000.0);
     */
    System.out.println("------ Processo seletivo -------");
    imprimirSelecionados();
    System.out.println("------ Solicitação de cada candidato -------");

    selecaoCandidatos();

  }

  static void imprimirSelecionados() {
    String[] candidatos = { "RAFAELA", "ANTONIO", "FERNANDO", "KEDMA", "ANA" };
    System.out.println("Imprimentos a lista de candidatos com o índice do candiadto");

    for (int i = 0; i < candidatos.length; i++) {
      System.out.println("O candidato de nº " + (i + 1) + " é " + candidatos[i]);

      System.out.println("Iteração de forma abreviada com o for each");
      for (String candidato : candidatos) {
        System.out.println("O candidato selecionado foi " + candidato);
      }
    }
  }

  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void selecaoCandidatos() {

    String[] candidatos = { "JOÃO", "PAULO", "THIAGO", "MARIA", "RAFAELA", "ANTONIO", "FERNANDO", "KEDMA", "ANA",
        "PEDRO" };

    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();
      System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado(a) para a vaga");
        candidatosSelecionados++;
      }
      candidatosAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1880, 2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o Candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para o Candidato com contra proposta");
    } else {
      System.out.println("Aguardando demais Candidatos");
    }
  }
}