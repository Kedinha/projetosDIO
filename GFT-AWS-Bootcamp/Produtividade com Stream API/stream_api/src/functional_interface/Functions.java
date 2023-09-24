package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Functions {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(11, 22, 33, 44, 55);

    // Usar a Function com expressão lambda para dobrar todos os números
    Function<Integer, Integer> dobrar = numero -> numero * 2;

    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
    List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        // .map(n -> n * 2)
        .toList();

    // Imprimir a lista de números dobrados
    numerosDobrados.forEach(System.out::println);
  }
}