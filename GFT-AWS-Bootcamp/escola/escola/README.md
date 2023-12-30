### Getters e Setters
Seguindo a convenção Java Beans:
Os métodos <strong>"Getters"</strong> e <strong>"Setters"</strong> são utilizados para <u>buscar</u> valores de atributos ou definir novos valores de atributos, de instâncias de classes.

#### O método Getter
- Retorna o valor do atributo especificado.
#### O método Setter 
- Define outro novo valor para o atributo especificado.

Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras abaixo:
- Os atributos precisam ter o modificador de acesso private. Ex.: private String nome;
- Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos getX e setX, Ex.: getNome() e setNome(String novoNome);
- O método <strong>get</strong>, é responsável por obter o valor atual do atributo, logo ele precisa ser public, retornar um tipo correspondente ao valor, 
<strong>Ex.:</strong> public String getNome() {};
- O método <strong>set</strong>, é responsável por definir ou modificar o valor de um atributo em um objeto, logo, ele também precisa ser public, receber um parâmetro do mesmo tipo da variável, mas não retorna nenhum valor void. 
<strong>Ex.:</strong> public void setNome(String newNome);