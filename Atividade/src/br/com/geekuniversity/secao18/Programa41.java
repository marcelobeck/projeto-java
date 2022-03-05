package br.com.geekuniversity.secao18;
//Trabalhando com Strings

import java.util.Locale;

/*
Em Java Strings são imutáveis, ou seja, não mudam.

 */
public class Programa41 {
    public static void main(String[] args) {
        String curso = "Programação em Java: Essencial";
        // curso.replace("Java", "Python"); //Altera na String, se encontrar, a primeira palavra pela segunda.
        // curso = curso.toLowerCase(); //Converte as letras maiúsculas para minúsculas
        // Uma String em Java é um Array de caracteres.
        // curso = curso.toUpperCase();

        //System.out.println(curso);

        //System.out.println(curso.charAt(0)); //Posições das String no array

        /*
        - Esse for inverte as palavras
        for(int i = (curso.length() - 1); i >= 0; i--){ -> O -1 seria a posição (30 - 1) = 29.
            System.out.println(curso.charAt(i));
         */

        for (int i = 0; i < curso.length(); i++){ // Imprimi caracter por caracter
            System.out.println(curso.charAt(i)); // ln pula uma linha, só o print, fica um do lado do outro
        }
    }
}