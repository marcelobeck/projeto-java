package br.com.geekuniversity.secao06;

// Tipo de dados
// Numéricos (Inteiros)

public class Programa11 {
    public static void main(String[] args) {
        // Os tipos primitivos são usados para armazenar valores
        // Tipos primários/primitivos, comuns da linguagem java, cada um deles ocupa um espaço diferente na memória
        long num0 = 99; // Inteiro 99999999999999999999999999999
        int num1 = 4; // Inteiro 99999999999
        short num2 = 4; // Inteiro (curto/menor/baixo) 99999
        byte num3 = 4; // Inteiro
        char num8 = 34;

        // Tipos não primários/primitivos
        Long num7 = (long) 9999999; //fazendo um (Cast) para aceitar o valor do tipo long
        Integer num4 = 98;
        Short num5 = 7;
        Byte num6 = 9;
        Character num9 = 35;

        System.out.println(" long/Long " + Long.SIZE + " bits ");
        System.out.println(" int/Integer " + Integer.SIZE + " bits ");
        System.out.println(" short/Short " + Short.SIZE + " bits ");
        System.out.println(" byte/Byte " + Byte.SIZE + " bits ");
        System.out.println(" char/Character " + Character.SIZE + " bits ");

        System.out.println(" Valor Min long/Long " + Long.MIN_VALUE);
        System.out.println(" Valor Max long/Long " + Long.MAX_VALUE);

        System.out.println(" Valor Min int/Integer " + Integer.MIN_VALUE);
        System.out.println(" Valor Max int/Integer " + Integer.MAX_VALUE);

        System.out.println(" Valor Min short/Short " + Short.MIN_VALUE);
        System.out.println(" Valor Max short/Short " + Short.MAX_VALUE);

        System.out.println(" Valor Min byte/Byte " + Byte.MIN_VALUE);
        System.out.println(" Valor Max byte/Byte " + Byte.MAX_VALUE);

        System.out.println(" Valor Min char/Character " + Character.MIN_VALUE); // Nao tem, olhar na tabela ASCII
        System.out.println(" Valor Max char/Character " + Character.MAX_VALUE); // Nao tem, olhar  na tabela ASCII


    }

}