package br.com.geekuniversity.secao07;

//Matrizes

/*
 * Vetores/arrays/matrizes multi-dimenssionais
 *
 * Vetor, (se fala uma linha de elementos)
 * int numeros[3];
 * numeros[0] = 3;
 * numeros[1] = 2;
 * numeros[2] = 5;
 *
 *
 * Matriz, (se fala que tem linhas e colunas)
 * [linhas][colunas]
 * int numeros[3][3]
 *
 * numeros[0][0] = 1;
 * numeros[0][1] = 2;
 * numeros[0][2] = 5;
 * numeros[1][0] = 7;
 * numeros[1][1] = 4;
 * numeros[1][2] = 9;
 * numeros[2][0] = 3;
 * numeros[2][1] = 6;
 * numeros[2][2] = 32;
 *
 *
 */
public class Programa18 {

    public static void main(String[] args) {
        //Declaração
        int outros_numeros[][];

        //Declaração e definição de tamanho
        int numeros[][] = new int[3][3];

        //Declarar, definir o tamanho e inicializar
        int mais_numeros[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        //Declarar uma matriz informando somente as linhas
        int matriz[][] = new int[2][];
        matriz[0] = new int[5]; // na minha matriz linha 0, quero que coloque 5 elementos.
        matriz[1] = new int[3];

        // Três linhas e números de elementos, em umas das linhas têm 2, 3, 5 elementos.
        int nova_matriz[][] = { {1, 2}, {4, 5, 6, 7, 8}, {9, 10, 11} };



    }
}