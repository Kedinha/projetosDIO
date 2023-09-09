package lanchonete;

public class Cozinheiro {
  public void adicionarLancheNoBalcao(){
    System.out.println("Adicionando lancha natural no balcao");
    }
  public void adicionarSucoNoBalcao(){
  System.out.println("Adicionando suco no balcao");
  }

  public void adicionandoComboNoBalcao(){
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }

  public void prepararLanche(){
   System.out.println("Preparando lanche tipo natural");
  }

  public void prepararVitamina(){
   System.out.println("Preparando vitamina");
  }

  public void prepararCombo(){
   prepararLanche();
   prepararVitamina();
  }

  public void selecionarIngredientesLanche(){
   System.out.println("Selecionando o pao, sala, ovo e carne");
  }


  public void selecionarIngredientesVitamina(){
   System.out.println("Selecionando fruta, leite e suco");
  }

  public void lavarIngredientes(){
    System.out.println("Lavando ingredientes");
  }


  
}
