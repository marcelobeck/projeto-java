package br.com.geekuniversity.secao08;

//Criando nossas próprias funções
/*
Faça um programa, que receba diversos nomes de frutas do usuário
e no final imprima essas frutas em ordem contrária. O programa deve
solicitar ao usuário quantas frutas devem informar.
 */

import java.util.Scanner;
// umas das funções do Java que foram utilizadas, main, Scanner, nextLine
public class Programa20 {
    //Declaração do vetor, é uma variável dinâmica informada pelo usuário;
    //Criar as variáveis para ficar visíveis para acessar dentro dessa classe;
    //Uma variável declarada dentro de um bloco só é acessada dentro do bloco;
    static String frutas[]; //Variáveis Globais. Porque todo o programa consigo acessar;
    static Scanner teclado = new Scanner(System.in); //Variáveis Globais. Porque todo o programa consigo acessar;

    //Se foi declarado a variável como Static, obrigatoriamente deverá ser Static dentro de uma ou mais funções;
    public static void main(String[] args) {
        int qtd;

        System.out.println("Informe a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine()); // Aqui recebe um valor do tipo String, terá que converter para Inteiro

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe a " + (i + 1) + " Fruta: ");
            frutas[i] = teclado.nextLine();
        }
        for (int i = 0; i < qtd; i--) {
            System.out.println(frutas[i]);
        }

        cadastrar_dados(qtd); //Precisa receber um parametro do tipo inteiro
        mostrar_dados(qtd);

        teclado.close();
    }
    /*
    Uma função deve ter o seguinte:
    a) Tipo de retorno: (Tipo de dados que a função vai retornar)
    b) Nome; (corresponde a ação que a função realiza
    c) Parametro/Argumentos de entrada (Opcional)
    d) Retorno (Opcional - depende do retorno)
     */
        // void não retorna nada (vazio). Quando não tem retorno não tem a opção a e d.
        // a opção a, tem mas o Void nao tem retorno
        // função void simplesmente executa

        static void cadastrar_dados (int quantidade){ // Recebi a quantidade
            //Definindo o tamanho do vetor
            frutas = new String[quantidade];

            // Exemplo, se for três elementos. 0...2 (0, 1, 2)
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Informe a " + (i + 1) + " fruta: ");
                frutas[i] = teclado.nextLine(); // Aqui escreve a String. O [i] é a posição
            }

        }

        static void mostrar_dados (int quantidade){ // Receber a quantidade que precisa mostrar
            //forma decrementada, for ao contrário
            for (int i = (quantidade - 1); i >= 0; i--) { // i = i + 1
                System.out.println(frutas[i]);

            }
        }
    }



