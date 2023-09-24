package main.java.list.OperacaoesBasicas;

public class Tarefa {
  //atributo
  private String descricao;

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }


  public String getDescricao() {
    return this.descricao;
  }


  @Override
  public String toString() {
    return "{" +
      " descricao='" + getDescricao() + "'" +
      "}";
  }

}
