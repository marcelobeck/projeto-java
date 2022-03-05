package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Lendo em arquivos
public class Programa43 {

    public static void main(String[] args) {
        try{
            Scanner ler = new Scanner(new FileInputStream("entrada.txt"));

            while(ler.hasNextLine()){ // Ler linha a linha, começo até o fim. hasNextLine, enquanto tiver próxima linha.
                String linha = ler.nextLine();
                System.out.println(linha);
            }
            ler.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivos não encontrados.");
        }
    }
}
