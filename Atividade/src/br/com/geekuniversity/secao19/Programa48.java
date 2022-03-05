package br.com.geekuniversity.secao19;
//Conjuntos
//Obs: Conjuntos é uma coleção.

/*
Os conjuntos são implementados com a interface Set, e umas
das classes que implementam esta interface é a HashSet

A maioria das coleções possuem os mesmos métodos já conhecidos
e utilizados com as listas, mas o comportamento desses objetos
é um pouco diferentes.

A performance também é melhor em conjuntos do que em listas.

Caracteristicas dos conjuntos:
- Não aceitam valores repetidos;
- A ordem de inserção não é respeitada (Realiza uma semi-ordenação);
- Não aceita ordenação;
- Não possui indice;

 nomes.add("Maria"); //posição 0
        nomes.add("Felicity"); //posição 1
        nomes.add("Joao"); //posição 2
        nomes.add("Andre"package br.com.geekuniversity.secao19;
//Conjuntos
//Obs: Conjuntos é uma coleção.

/*
Os conjuntos são implementados com a interface Set, e umas
das classes que implementam esta interface é a HashSet

A maioria das coleções possuem os mesmos métodos já conhecidos
e utilizados com as listas, mas o comportamento desses objetos
é um pouco diferentes.

A performance também é melhor em conjuntos do que em listas.

Caracteristicas dos conjuntos:
- Não aceitam valores repetidos;
- A ordem de inserção não é respeitada (Realiza uma semi-ordenação);
- Não aceita ordenação;
- Não possui indice;

 nomes.add("Maria"); //posição 0
        nomes.add("Felicity"); //posição 1
        nomes.add("Joao"); //posição 2
        nomes.add("Andre"); //posição 3
        nomes.add("Felicity"); //Conjuntos não aceitam repetição de valores. Obs: Não aceita repetição senão seria a posição 4

 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Programa48 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        Scanner teclado = new Scanner(System.in);
        boolean res; // recebe true ou falso

        for(int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i + 1) + "/5 nome: ");
            String nome = teclado.nextLine();
            //Adicionando nomes no conjunto nome, se tiver resultado vai vir pra "res".
            res = nomes.add(nome); // se retornar preenchido, retorna true, caso não retornar nada é falso.
            if(!res){ //se o res não for true
                System.out.println("O nome não pode ser repetido.");
                i--; // decremente, porque caso digitar um mesmo nome, vai entrar e adicionar, mas não precisa, ai é usado o i-- para informar novamente o nome sem adicionar
            }
        }

        System.out.println("No conjunto nomes temos " + nomes.size() + " elementos");

        for(String nome : nomes){
            System.out.println(nome);
        }
        teclado.close();
    }
 }

