package main.java.list.OperacaoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> itemList;

  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quant) {
    itemList.add(new Item(nome, preco, quant));
  }

  public void removerItem(String nome) {
    List<Item> itemsParaRemover = new ArrayList<>();

    for (Item i : itemsParaRemover) {
      if (i.getNome().equalsIgnoreCase(nome)) {
        itemsParaRemover.add(i);
      }
    }
    itemList.removeAll(itemsParaRemover);
  }

  public void obterItem(){
    System.out.println(itemList);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    System.out.println("Lista vazia! " + carrinhoDeCompras.itemList);
    carrinhoDeCompras.adicionarItem("mamao", 20, 2);
    System.out.println("Item no carrinho: " + carrinhoDeCompras.itemList);
  }

}
