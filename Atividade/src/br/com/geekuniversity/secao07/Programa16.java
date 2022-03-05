package br.com.geekuniversity.secao07;

//Vetores parte 1

/*
 * Vetores são conhecidos como Array (vetores uni-dimensionais)
 * [0][1][2][3][4][5], um do lado do outro
 * float valores[10]; posição 0...9 (n - 1), o n, é o número de elementos
 * int numeros[5]; 0..4 (n - 1) = 4
 *
 *
 * vetor[indice];
 * numeros[0] = 1; // primeiro elemento, indice 0
 * numeros[1] = 3; // segundo elemento, indice 1
 * numeros[2] = 5; // terceiro elemento, indice 2
 * numeros[3] = 7; // quarto elemento, indice 3
 * numeros[4] = 9; // quinto elemento, indice 4
 */


public class Programa16 {
    public static void main(String[] args) {
        //Declarando um vetor
        int vetor [];

        // Declarando e especificando o tamanho do vetor
        int numeros[] = new int [5];

        //Declarar, especificar o tamanho e inicializando
        int outros_numeros[] = {1, 3, 5, 7, 9}; // Esse vetor tem 5 elementos

        //Outros tipos
        float valores[] = new float[5];
        char caracteres[] = new char[20];
        String nome[] = new String[4];


        String frutas[] = {"Manga", "Uva", "Banana"};

    }

}