package br.com.geekuniversity.secao18;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
//Escrita em arquivos 2
public class Programa44 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            //FileOutputStream, arquivo de saída. Se existir ele adiciona, caso não, ai cria um novo arquivo.
            PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));

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
