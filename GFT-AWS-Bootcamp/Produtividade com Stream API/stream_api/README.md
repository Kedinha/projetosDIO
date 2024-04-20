## Stream API e Java

- A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da <STRONG><I>programação programação funcional</I></STRONG>
- Stream, trata-se de uma poderosa solução para processar coleções de maneira <u>declarativa,</u> ao invés da tradicional e burocrática forma imperativa.
- Combinada com as Expressões Lambda e Method reference, eles proporcionam uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.
- As operações na `Stream API` podem ser classificadas em duas categorias principais:
#### Lambda
 - As expressões `lambda`` permitem representar interfaces funcionais (interfaces com um único método abstrato) de forma mais concisa e possibilitam escrever código no estilo funcional.
 - As interfaces funcionais desempenham um papel crucial na programação funcional em Java, pois servem de base para o uso de expressões lambda.
 - Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.
- As funções lambda em Java tem a sintaxe definida como <b>(argumento) -> (corpo).</b>

#### Method Reference

- Method Reference é um novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível.
- Para utilizá-lo, basta informar uma classe ou referência seguida do símbolo <b>“::”</b> e o nome do método sem os parênteses no final.

### Functional Interface

Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.

- `Consumer<T>`: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É utilizada
  principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.

  - `Supplier<T>`: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. É comumente
  usada para criar ou fornecer novos objetos de um determinado tipo.

  - `Function<T, R>`: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. É
  utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.

  - `Predicate<T>`: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou
  falso). É comumente usada para filtrar os elementos do Stream com base em alguma condição.

  - `BinaryOperator<T>`: Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo
  tipo T. É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

  > _Classe Anônima_:
> A classe anônima em Java é uma classe não recebeu um nome e é tanto declarado e instanciado em uma única instrução.
> Você deve considerar o uso de uma classe anônima sempre que você precisa para criar uma classe que será instanciado
> apenas uma vez.

#### Outros Métodos

- Combinada com as Expressões Lambda e Method reference, eles proporcionam uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.
- As operações na Stream API podem ser classificadas em duas categorias principais: 
1. Operações Intermediárias: são aquelas que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados. São elas:
- `filter(Predicate<T> predicate)`: Filtra os elementos da Stream com base em um predicado. Retorna uma nova Stream contendo apenas os elementos que atendem ao critério do predicado.
Exemplo: ` stream.filter(n -> n > 5)`
- `map(Function<T, R> mapper)`: Transforma cada elemento da Stream usando a função especificada e retorna uma nova Stream contendo os elementos resultantes.
Exemplo: `stream.map(s -> s.toUpperCase())`
- `sorted()`: Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) ou de acordo com um comparador fornecido.
Exemplo: `stream.sorted()`
- `distinct()`: Remove elementos duplicados da Stream, considerando a implementação do método equals() para comparação.
Exemplo: `stream.distinct()`
- `limit(long maxSize)`: Limita o número de elementos da Stream aos maxSize primeiros elementos
Exemplo: stream.limit(10)
- `skip(long n)`: Pula os primeiros n elementos da Stream e retorna uma nova Stream sem eles.
Exemplo: `stream.skip(5)`
2. Operações Terminais: são aquelas que encerram o pipeline e produzem um resultado final. São elas:
- `forEach(Consumer<T> action)`: Executa uma ação para cada elemento da Stream.
Exemplo: `stream.forEach(System.out::println)`
- `toArray()`: Converte a Stream em um array contendo os elementos da Stream.
Exemplo: `stream.toArray()`
- `collect(Collector<T, A, R> collector)`: Coleta os elementos da Stream em uma estrutura de dados específica, como uma lista ou um mapa.
Exemplo: stream.collect(Collectors.toList())
- `count()`: Retorna o número de elementos na Stream.
Exemplo: `stream.count()`
- `anyMatch(Predicate<T> predicate)`: Verifica se algum elemento da Stream atende ao predicado especificado.
Exemplo: `stream.anyMatch(s -> s.startsWith("A"))`
- `allMatch(Predicate<T> predicate)`: Verifica se todos os elementos da Stream atendem ao predicado especificado.
Exemplo: `stream.allMatch(n -> n > 0)`
- `noneMatch(Predicate<T> predicate)`: Verifica se nenhum elemento da Stream atende ao predicado especificado.
Exemplo: stream.noneMatch(s -> s.isEmpty())
- `min(Comparator<T> comparator)` e `max(Comparator<T> comparator)`: Encontra o elemento mínimo e máximo da Stream, respectivamente, de acordo com o comparador fornecido.
Exemplo: `stream.min(Comparator.naturalOrder())` ou `stream.max(Comparator.naturalOrder())`
- `reduce(T identity, BinaryOperator<T> accumulator)`: Combina os elementos da Stream usando o acumulador especificado e retorna o resultado final.
Exemplo: `stream.reduce(0, (a, b) -> a + b)`

### Referências
DIO Camila Cavalcante - 
Disponível em: https://dio.me/  
https://github.com/cami-la


[1] "Java Stream API - Oracle." Oracle Brasil. Disponível em: https://www.oracle.com/br/technical-resources/articles/java-stream-api.html.

[2] "Java Collections API Examples - cami-la." GitHub. Disponível em: https://github.com/cami-la/collections-java-api-2023.

[3] "Como usar funções functional_interface em Java - DevMedia." DevMedia. Disponível em: https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826.


# Optional

O objetivo da classe Optional no Java é fornecer uma abordagem mais segura e expressiva para tratar casos em que um valor pode ser ausente (nulo). 
Ela foi introduzida a partir do Java 8 para evitar o temido NullPointerException (NPE) que é comum quando se trabalha com referências nulas. Optional permite encapsular um valor que pode ser nulo dentro de um objeto Optional. Isso indica explicitamente que o valor pode ou não estar presente e requer que o código que deseja acessá-lo faça uma verificação explícita.
<br>
- `of(value)`: Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.

```java
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.get());
```

- `ofNullable(value)`: Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.

```java
String nullableValue = null;
Optional<String> optionalValue = Optional.ofNullable(nullableValue);
System.out.println(optionalValue.isPresent());
```
- `empty()`: Retorna um Optional vazio (sem valor).

```java
Optional<String> optionalValue = Optional.empty();
System.out.println(optionalValue.isPresent());
```

- `isPresent()`: Verifica se o Optional contém um valor não nulo.

```java
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.isPresent());
```

- `isEmpty()` (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).

```java
Optional<String> optionalValue = Optional.ofNullable(null);
System.out.println(optionalValue.isEmpty());
```

- `get()`: Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.

```java
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.get());
```

- `orElse(defaultValue)`: Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio

```java
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElse("Default"); 
System.out.println(result);
```

- `orElseGet(supplier)`: Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.

```java
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElseGet(() -> "Value from Supplier");
System.out.println(result);
```
- `orElseThrow(exceptionSupplier)`: Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.

```java
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
```

- `ifPresent(consumer)`: Executa uma ação fornecida por um Consumer se o Optional contiver um valor.

```java
Optional<String> optionalValue = Optional.of("Hello");
optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
```
---

### Referências:

[1] "Java Platform, Standard Edition 17 - Class Optional." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Optional.html.

[2] "Java Optional - Baeldung." Baeldung. Disponível em: https://www.baeldung.com/java-optional.