package br.com.geekuniversity.secao19;
//Mapas (Map)

/*
Os mapas são representados em Java pela interface Map
e mapeia seus elementos utilizando o conceito de chave/valor

- Mapas são conhecidos como se fossem/representassem 3 coleções:
       - Coleção de chaves;
       - Coleção de valores;
       - Coleção de associações;
 */

//Mapas (Map)
/*
Os mapas são representados em Java pela interface Map
e mapeia seus elementos utilizando o conceito de chave/valor

- Mapas são conhecidos como se fossem/representassem 3 coleções:
       - Coleção de chaves;
       - Coleção de valores;
       - Coleção de associações;
 */

import java.util.*;

public class Programa50 {
    public static void main(String[] args) {
    //Irá utilizar com chave o (Inteiro, String)
    Map<Integer, String> pessoas = new HashMap<Integer, String>();

    pessoas.put(21, "Jone"); // idade da pessoa, serve como chava para o nome Jone
    pessoas.put(31, "Antonieta");
    pessoas.put(41, "Jolei");

    //Coleções de chaves
    System.out.println("Chaves: " + pessoas.keySet());//Imprimi uma lista de idade, no caso das chaves

    //Coleção de valores
    System.out.println("Valores: " + pessoas.values());

    //Coleção de associações entre chace e valor
    System.out.println("Associação: " + pessoas.entrySet());

    //Forma 1
    //Disponibilizado a partir do Java 8
    pessoas.keySet().forEach(idade -> { //forEach, para cada idade. Devolve a chave e o valor.
        System.out.println(pessoas.get(idade)); //passando a chave e imprimindo elas.
    });
    //Forma 2
    //Iterar na coleção de chaves
    Set<Integer> chaves = pessoas.keySet();
    for(Integer idade: chaves){
        System.out.println(pessoas.get(idade));
    }
    //Iterar na coleção de valores
    //Forma 1
    Collection<String> valores = pessoas.values();
    for(String nome : valores) {
        System.out.println(nome);
    }

    //Forma 2
    pessoas.values().forEach(nome -> {
        System.out.println(nome);
    });

    //Iterar a coleção de associações

    //Forma 1
    Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
    for(Map.Entry<Integer, String> associacao: associacoes){
        System.out.println(associacao.getKey() + " - " + associacao.getValue());

    }
    //Forma 2
    pessoas.entrySet().forEach(associacao -> {
        System.out.println(associacao.getKey() + " - " + associacao.getValue());
    });
  }
}
