package br.com.geekuniversity.secao21;
//Pilhas

/*
São estruturas de dados onde o elemento que está visível/disponível é o que
está sempre no topo.

Os elementos, ao serem adicionados em uma pilha, são adicionados sempre no topo.

Para remover elementos da pilha, só podemos remover o topo.

O último elemento a entrar é o primeiro a sair.

[3] o topo é esse, e se precisar remover, retira o topo
[2]
[1]
[0]
 */

public class Programa60 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println(pilha);

        pilha.insere("Joao");
        pilha.insere("Felicity");


        System.out.println(pilha);

        String r1 = pilha.pegaTopo();
        System.out.println(r1);

        String r2 = pilha.remove();
        System.out.println(r2);

        System.out.println(pilha.vazia()); // Se tiver vazia irá retornar True ou False

    }

}
