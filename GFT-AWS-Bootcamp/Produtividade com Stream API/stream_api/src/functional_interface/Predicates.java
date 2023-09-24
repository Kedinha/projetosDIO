package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
  public static void main(String[] args) {
  //cria lista de palavras
   List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

   //cria uma Predicate que verifica se a palavra tem mais de 5 caravteres
   Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    //usando stream para filtrar as palavras e imprime só as palavras que ássaram pelo filtro
   palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);
  }
}
