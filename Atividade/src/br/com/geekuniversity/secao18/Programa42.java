package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//Escrevendo em arquivos
public class Programa42 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            // PrintStream, esse cara exibi uma seção (FileNotFoundException)
            // Desta forma, toda vez que o programa for executado, o arquivo será recriado e toda informação, se
            // pré-existente será excluida, recomeçando um arquivo zerado.
            PrintStream escrever = new PrintStream("saida.txt");

            for(int i = 0; i < 5; i++){
                //Caso consiga escrever, iremos pergunta para o usuário informar algo.
                System.out.println("Escreva algo");
                String msg = teclado.nextLine();
                escrever.println(msg);
            }
            escrever.close();
        }catch (FileNotFoundException e){ // o erro ocorre quando não tem opção de escrita do arquivo, ou não tem espaço em disco.
            System.out.println("Não foi possível criar o arquivo.");
        }
        teclado.close();



    }
}