package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

//LinkedList
public class Programa58 {
    public static void main(String[] args) {
        /*
        é a forma mais facil de fazer, na classe "ListaLigada" foi feito mesmo coisa que aqui,
        só que lá foi feito manualmente. Conhecer como funciona a implementação.
         */

        List<String> lista = new LinkedList<String>();

        System.out.println(lista.size());

        lista.add("Felicity");

        lista.add(0, "Maria"); // o 0 é a primeira posição
    }
}
