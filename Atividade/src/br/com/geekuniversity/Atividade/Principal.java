package br.com.geekuniversity.Atividade;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        double teste;
        double valor;

        Scanner scanner = new Scanner(System.in);
        teste = scanner.nextInt();

        if(teste > 0){
            valor = Math.sqrt(teste);
            System.out.println(valor);
        } else {
            valor = Math.pow(teste, 2);
            System.out.println(valor);

        }

       
    }
}




