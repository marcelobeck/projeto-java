package br.com.geekuniversity.secao06;

//Tipo de dados
//Numéricos (Reais)

public class Programa12 {
    public static void main(String[] args) {

        // tipos primários/primitivos
        // Por padrão, os números reais em Java são considerados double
        float preco1 = 23.4f; // Ocupa menos espaço em memória que o double (usar esse tipo)
        double preco2 = 23.4; // Se o valor for muito extenso usar o double (usar esse tipo)


        //tipos não primitivos/primitivos

        Float preco3 = 44.5f; // Usar esses tipos quando for para conversão de um tipo para o outro.
        Double preco4 = 44.5; // Usar esses tipos quando for para conversão de um tipo para o outro.


        System.out.println(" float/Float " + Float.SIZE + " bits "); // Somente consegue fazer assim com o não primitivo (Float.SIZE)
        System.out.println(" double/Double " + Double.SIZE + " bits ");

        System.out.println(" Valor Min float/Float " + Float.MIN_VALUE);
        System.out.println(" Valor Max double/Double " + Double.MAX_VALUE);


    }

}