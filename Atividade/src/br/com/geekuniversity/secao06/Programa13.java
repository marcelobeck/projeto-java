package br.com.geekuniversity.secao06;

// Tipos de dados alfanuméricos
// Caracteres e Strings
public class Programa13 {

    public static void main(String[] args) {
        //Tipos primitivos
        char letra1 = 'a'; // Aspas simples é um caracter. Aspas duplas é uma String
        char letra2 = 97; // 97 em decimal == 'a'
        //String nom = "asd"; Não existe o tipo primitivo 'String' em Java

        letra2 = (char) (letra2 + 1); // (char) é o tipo (cast) para verificar que é um (char).

        System.out.println("Letra1 " + letra1);
        System.out.println("Letra2 " + letra2);

        //Tipos não primitivos
        Character letra3 = 'A';
        String nome = "A String é só para o Tipo não primitivo";

        System.out.println("Letra3 " + letra3);

        System.out.println("char/Character " + Character.SIZE + " bits");

        System.out.println("valor Min char/Character " + Character.MIN_VALUE); // 0
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE); // 65535

        System.out.println("Nome " + nome);

        //System.out.println("String" + String.SIZE); SIZE não funciona com String

        System.out.println("String " + (Character.SIZE * nome.length()) + " bits"); // aqui e uma gambiarra para funcionar, saber a quantidade que ocupa em memória
    }
}
