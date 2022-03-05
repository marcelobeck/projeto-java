package br.com.geekuniversity.secao09;

//Classes
/*
- Primeira classe que vamos criar
- Toda classe no comeco das palavra deverá ser maiusculo
- As iniciais de cada parte deverá ser maiuscula. Ex: GuardaChuva
- Criado uma classe chamado Produto
- Programa1 até o Programa22 são programas por causa do metodo main, não classes
- Não pode conter caracteres especiais, espaço
- Nas classes Java, não existe a implementação da função main()
- Toda classe Java possui a seguinte forma:
- O nome da classe Java DEVE ser o mesmo nome do arquivo da classe Java
- Tudo que estiver dentro das "classes" {} faz parte da classe

  public class Produto{
  }
*/

//Atributos
/*
- São as caracteristicas da classe/molde/modelo de dados:
- Podemos entender atributos como variáveis da classe;
- Uma outra forma de nomenclatura para os atributos são estados;
- Atributos são nomeados em letras minúsculas, sem espaços, sem caracter especiais;

//Classes
/*
- Primeira classe que vamos criar
- Toda classe no comeco das palavra deverá ser maiusculo
- As iniciais de cada parte deverá ser maiuscula. Ex: GuardaChuva
- Criado uma classe chamado Produto
- Programa1 até o Programa22 são programas por causa do metodo main, não classes
- Não pode conter caracteres especiais, espaço
- Nas classes Java, não existe a implementação da função main()
- Toda classe Java possui a seguinte forma:
- O nome da classe Java DEVE ser o mesmo nome do arquivo da classe Java
- Tudo que estiver dentro das "classes" {} faz parte da classe

  public class Produto{
  }
*/

//Atributos
/*
- São as caracteristicas da classe/molde/modelo de dados:
- Podemos entender atributos como variáveis da classe;
- Uma outra forma de nomenclatura para os atributos são estados;
- Atributos são nomeados em letras minúsculas, sem espaços, sem caracteres especiais,
  sem acentuação. Mas pode ser assim, guardaChuva
 */

// Métodos
/*
- Podemos entender os métodos como a ação que é realiada por um objeto da classe;
- Podemos entender também que os métodos são comportamentos dos objetos da classe;
- Ex: Comportamento em aumentar o preço do produto

- Mesmos requisitos para funções
  Uma função deve ter o seguinte:
    a) Tipo de retorno: (Tipo de dados que a função vai retornar)
    b) Nome; (corresponde a ação que a função realiza)
    c) Parametro/Argumentos de entrada (Opcional)
    d) Retorno (Opcional - depende do retorno)

-Método é praticamente a mesma que função, a diferença é que a função
 pode ser tratada como uma função solta, não depende de nenhuma classe. O método
 é específico de uma classe.
 Objetos/Instâncias são a mesma coisa.

-Função: Não utiliza os objetos da classe. Seria uma função solta.

 */


public class Produto {
    String nome;
    float preco;
    float desconto;

    //Método para aumentar o preço do produto em 10, não retorna nada, simplismente executa
    // Lembrando o método faz parte de uma classe, a função é solta não faz parte de nenhuma classe
    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    }
}