package lanchonete.atendimento.cozinha;

public class Almoxarife {
  public void controlarEntrada() {
    System.out.println("Controlando as entradas dos itens");
  }
  private void controlarSaida(){
    System.out.println("Controlando a saída dos itens");
  }
// modificador Default é aplicado para pacotes que só suas classes podem visualizar
  void entregarIngredientes(){
    System.out.println("Entregando ingredientes");
    controlarSaida();
  }

  void trocarGas(){
    System.out.println("Almoxarife trocando gas");
  }
}
