package CofresSeguros;

import java.util.Scanner;

public class DesafioCofres {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    scanner.close();

    // Cria o cofre de acordo com o tipo
    Cofre cofre;
    if (tipoCofre.equalsIgnoreCase("digital")) {
      System.out.print("Informe a senha do cofre digital: ");
      int senha = scanner.nextInt();
      cofre = new CofreDigital(senha);
    } else if (tipoCofre.equalsIgnoreCase("fisico")) {
      cofre = new CofreFisico();
    } else {
      System.out.println("Tipo de cofre invalido.");
      return;
    }

    // Validação para cofres seguros (cofres digitais)
    if (cofre instanceof CofreDigital) {
      System.out.print("Confirme a senha para abrir: ");
      int confirmacaoSenha = scanner.nextInt();

      if (!((CofreDigital) cofre).validarSenha(confirmacaoSenha)) {
        System.out.println("Senha incorreta. Cofre não aberto.");
        return;
      }
    }
    // Exibe as informações do cofre após a validação
    cofre.imprimirInformacoes();

  }
}
