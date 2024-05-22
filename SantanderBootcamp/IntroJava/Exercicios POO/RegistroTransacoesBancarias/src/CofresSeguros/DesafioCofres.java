package CofresSeguros;

import java.util.Scanner;

public class DesafioCofres {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    System.out.print("Informe o Tipo da conta: ");
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();

    // Cria o cofre de acordo com o tipo
    // Cofre cofre;
    if (tipoCofre.equalsIgnoreCase("digital")) {
      System.out.print("Informe a senha do cofre digital: ");
      int senha = scanner.nextInt();
      CofreDigital cofreDigital = new CofreDigital(senha);
      cofreDigital.imprimirInformacoes();

    } else if (tipoCofre.equalsIgnoreCase("fisico")) {
      CofreFisico cofreFisico = new CofreFisico();
      cofreFisico.imprimirInformacoes();
      System.out.print("Informe a chave do cofre fisico: ");

    } else {
      System.out.println("Tipo de cofre invalido.");
    }

    // Validação para cofres seguros (cofres digitais)
    CofreDigital cofreDigital = new CofreDigital(scanner.nextInt());
    if (cofreDigital instanceof CofreDigital) {
      System.out.print("Confirme a senha para abrir: ");
      int confirmacaoSenha = scanner.nextInt();

      if (!cofreDigital.validarSenha(confirmacaoSenha)) {
        System.out.println("Senha incorreta! Cofre não aberto.");
      } else {

        System.out.println("Cofre aberto!");

      }
      if (tipoCofre.equalsIgnoreCase("fisico")) {
        CofreFisico cofreFisico = new CofreFisico();
        cofreFisico.imprimirInformacoes();
      }

      scanner.close();
    }
  }
}
