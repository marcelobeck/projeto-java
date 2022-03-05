package br.com.geekuniversity.secao06;

// Tipos booleanos
public class Programa14 {
    public static void main(String[] args) {
        // Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        //Tipos não primitivos
        Boolean v = true;
        Boolean f = false;

        System.out.println("Verdadeiro " + verdadeiro);
        System.out.println("Falso " + falso);
        System.out.println("V " + v);
        System.out.println("F " + f);

        //	System.out.println("boolean/Boolean " + Boolean.SIZE); //Em memória vai ta 0 ou 1. O número 1 V e  0 falso

        if(verdadeiro) { // verdadeiro == true
            System.out.println("É verdadeiro");
        }else {
            System.out.println(" É falso");

        }

    }

}
