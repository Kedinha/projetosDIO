# Desafios de Código POO

### Dasafio 1 - Usando LinkedList e ArrayList

- Implementação do loop 'for': O loop for agora itera corretamente sobre a quantidade de transações informada pelo usuário.
  Verificação do tipo de transação: A verificação do tipo de transação (D ou S) foi aprimorada e agora utiliza a comparação maiúscula/minúscula (equals()).
- Tratamento de tipo inválido: Se o tipo de transação for inválido, uma mensagem de erro é exibida e o contador i é decrementado para - que o usuário possa redigitar a transação.
  Adição de transações à lista: As transações válidas são adicionadas à lista transacoes usando objetos Transacao que armazenam o número, tipo e valor da transação.
- Exibição da lista de transações: O loop for dentro da exibição do saldo final agora percorre a lista transacoes e imprime cada transação formatada usando o método toString() da classe Transacao.

### Desafio 2 - Usando Stream API

- Criação de fluxo:
  Um fluxo (stream) é criado a partir da lista transacoes usando o método stream().
- Mapeamento:
  O fluxo é mapeado para uma nova lista de strings usando o método map().
  Cada transação é convertida em uma string formatada usando o método formatarTransacao().
- Coleção:
  O resultado do mapeamento é coletado em uma nova lista usando o método collect() e o coletor Collectors.toList().
- Impressão:
  Para cada elemento na lista final, o método forEach() é usado para imprimir a string formatada no console.
- Método formatarTransacao():
  Este método recebe uma transação como parâmetro e retorna uma string formatada com o tipo da transação ("Depósito de" ou "Saque de"), seguido do valor da transação.
- Método atualizarSaldo():
  O método foi movido para fora da classe Transacao e agora recebe o saldo atual

### Desafio 3 - Criando Classe e Método Construtor

- Classe `ContaBancaria`:<br/>
  A classe `ContaBancaria` foi criada para encapsular as informações e operações da conta bancária.
- Atributo `saldo`:<br/>
  Um atributo privado `saldo` foi criado para armazenar o valor do saldo da conta.
- Construtor:<br/>
  Um construtor foi criado para inicializar a conta bancária com o saldo inicial fornecido pelo usuário.
- Métodos depositar() e sacar():<br/>
  Os métodos `depositar()` e `sacar()` foram implementados para realizar as operações de depósito e saque na conta, respectivamente.
  O método `depositar()` incrementa o saldo da conta com o valor do depósito e imprime uma mensagem de confirmação.
  O método `sacar()` verifica se o valor do saque é maior que o saldo disponível. Se for, imprime uma mensagem de erro. Caso contrário, subtrai o valor do saque do saldo e imprime uma mensagem de confirmação.
- Método `getSaldo()`:<br/>
  O método `getSaldo()` foi criado para retornar o valor do saldo atual da conta.<br/>
  <i>Formatação:</i>
  A formatação da saída foi aprimorada para exibir o saldo com uma casa decimal usando <b>printf()</b> .

### Desafio 4 - Herança Bancária: Entendendo a Herança e Polimorfismo

- #### Herança:

  - A classe ContaPoupanca herda da classe `ContaBancaria`, aproveitando os atributos e métodos da classe pai.

- #### Sobrecarga de Construtores:

  - Um construtor específico para `ContaPoupanca` foi implementado para receber e inicializar todos os atributos da classe.

- #### Polimorfismo:

  - O método `exibirInformacoes()` foi sobrescrito na classe `ContaPoupanca` para exibir as informações específicas da conta poupança, incluindo a taxa de juros.

- #### Formatação de Dados:
  - A classe `DecimalFormat` foi utilizada para formatar os valores decimais (saldo e taxa de juros) com duas casas decimais.
