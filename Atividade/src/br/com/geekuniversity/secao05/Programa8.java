package br.com.geekuniversity.secao05;

import java.util.Scanner;

// do while
public class Programa8 {
    public static void main(String[] args) {

        int idade;
        String nome;

        // Para receber dados do Usuário via teclado
        Scanner teclado = new Scanner(System.in);
        // Abre a variável teclado

        // Primeiro executa o bloco, depois faz a checagem
        do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine(); // A função nextLine recebe a String

            System.out.println("Informe a idade: ");
            // idade = teclado.nextInt(); Se usar assim vai da Bug // nextInt função do Scanner que recebe uma variável do tipo inteiro

            idade = Integer.parseInt(teclado.nextLine());
            // No while, se receber uma String (nome), depois um Inteiro (idade), e depois uma String (nome) novamente, terá que fazer a conversão para Int, porque recebe uma String
            // mas se colocar uma String vai da erro

            System.out.println(nome + " tem " + idade + " anos ");
        }while(idade > 0); // aqui ele faz a checagem

        teclado.close(); // fecha a variável teclado


    }
}
