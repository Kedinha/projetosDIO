package functional_interface;

import java.util.List;
import java.util.function.Supplier;
// import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Suppliers {
  public static void main(String[] args) {

    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";


    // Lista com 5 saudações com o metodo Supplier
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        // .collect(Collectors.toList());
        .toList();

    listaSaudacoes.forEach(System.out::println);
  }
}
