package br.com.geekuniversity.secao19;

/*
Revisão de Arrays (Vetores/Matriz)

- Um array tem um tamanho fixo. Ou seja, se criarmos um array com 5 elementos
ele terá sempre no máximo 5 elementos.

- Um array tem tipo de dados fixo. Ou seja, se criarmos um array de inteiros
ele só poderá ter inteiros.

- É difícil encontrar um determinado elemento em um array. Precisamos para isso
varrer todo o array atráves do seu índice, caso não façamos busca pelo índice.
 */

/*
Colections (Coleções)

- Java possui diversas classes/interfaces que facilitam muito o trabalho quando
se trata de coleções de dados. Essas classes/interfaces são chamadas de Collections ou (Coleções)

 */

/*
Listas

       - Aceitam repetições de valores:
       - Possuem tamanho "infinito" (Depende da memória)
       - Podemos adicionar valores de qualquer tipo, desde que não especificamos um tipo na declaração;

 */
import java.util.ArrayList;
import java.util.Collections;

public class Programa45 {
    public static void main(String[] args) {
        //ArrayList nomes = new ArrayList(); // Sem definir tipo de dado, podemos colocar qualquer tipo;
        ArrayList<String> nomes = new ArrayList<String>(); // Especificando que é do tipo String o nome.

        nomes.add("Marcelo"); //posição 0
        nomes.add("Falicity");
        nomes.add("Joli"); //posição 2
        nomes.add("Gek");
        nomes.add("Fulano"); //posição 4
        nomes.add("Joli"); //posição 5

        //Como foi definido no ArrayList o tipo String não ipá funcionar abaixo. Porque é outro tipo de dado.
        //nomes.add(44);
        //nomes.add(true); // boolean
        //nomes.add(12.4);
        //nomes.add('e');

        //System.out.println(nomes.get(0)); O acesso é via Indice. (nomes.get(0)).
        //System.out.println(nomes.get(3));

        //System.out.println(nomes.size());

        //for(int i = 0; i < nomes.size(); i++){
        // System.out.println(nomes.get(i));

//         }
        //for each
        // for(Object nome : nomes){ //Para cada Objeto dentro do ArrayList imprima o nome.
        //   System.out.println(nome);

        Collections.sort(nomes); // Ordenação de array

        for(String nome : nomes){ // Funciona o tipo String agora porque lá no ArrayList foi colocado o tipo String.
            System.out.println(nome);

        }
    }
}
