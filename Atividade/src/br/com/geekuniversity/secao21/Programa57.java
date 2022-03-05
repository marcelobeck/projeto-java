package br.com.geekuniversity.secao21;
//Lista Ligada / LinkedList

/*
Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista
ligada, eles estão em lugares diferentes, porém um aponta para o outro
indicando o próximo elemento.

[0][3][1][2][5][4]


 */

import br.com.geekuniversity.secao11.Cliente;

public class Programa57 {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adiciona("Fulano 1");
        System.out.println(lista);

        lista.adiciona("Fulano 2");
        System.out.println(lista);

        lista.adicionaNoComeco("Felicity");
        System.out.println(lista);

        lista.adiciona(1, "Xuxa");
        System.out.println(lista);

        Object ret = lista.pega(1);
        System.out.println(ret);

        System.out.println(lista.tamanho());

        /*
        System.out.println(lista);
        lista.adicionaNoComeco("Maria");
        System.out.println(lista);
        lista.adicionaNoComeco("Jolia");
        lista.adicionaNoComeco(lista);
        lista.adicionaNoComeco("felicity");
        lista.adicionaNoComeco(lista);

        String nome = "Pedro";
        lista.adicionaNoComeco(nome);
        System.out.println(lista);

        int numero = 42;
        lista.adicionaNoComeco(numero);
        System.out.println(lista);

        Cliente cli1 = new Cliente(34, "Juliana Paes", "Rua 3");
        lista.adicionaNoComeco(cli1);
        System.out.println(lista);

         */



    }
}
