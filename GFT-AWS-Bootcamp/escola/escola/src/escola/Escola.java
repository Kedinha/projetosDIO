package escola;

public class Escola {
  public static void main(String[] args) {
    // Cria-se um objeto
    Aluno felipe = new Aluno();
    // valor e atributos do objeto
    felipe.setNome("Felipe");
    felipe.setIdade(8);
    // obtem-se as informações do objeto
    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
    // RESULTADO NO CONSOLE
    // O aluno Felipe tem 8 anos
  }
}
