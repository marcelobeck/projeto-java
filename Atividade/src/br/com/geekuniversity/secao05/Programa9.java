package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Programa9 {

    //For e Foreach
    public static void main(String[] args) {

        int idade;
        String nome;

        // Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);

        // Variável de controle; condição de parada; forma de incremento
        // i++ -> i + i + 1
        for (int i = 0; i < 5; i++) {
            System.out.println("informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");

            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + "anos");
            }
        }

        teclado.close();
    }

}
