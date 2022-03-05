package br.com.geekuniversity.secao06;

//Operações Matemáticas
public class Programa15 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 9, res;
        float res2;

        //Soma
        res = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);

        //Subtração
        res = num1 - num2;
        System.out.println("A subtração de " + num1 + " - " + num2 + " é " + res);

        //Multiplicação
        res = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + res);

        //Divisão (Inteira)
        res = num2 / num1;
        System.out.println("A divisão de " + num1 + " / " + num2 + " é " + res);

        //Divisão (Real)
        res2 = (float) num2 / (float) num1; // (Cast) Obs: Quando faz operações com Inteiro o resutado é inteiro. Com o Cast vai retornar um ponto flutuante
        System.out.println("A divisão de " + num1 + " / " + num2 + " é " + res);

        //Módulo
        /*
         * Se o resto do módulo da variável por 2 for 0, a variavel é par.
         * Se o resto for 1, a variável é impar
         */
        res = num1 % 2;
        System.out.println("O resto da divisão de " + num1 + " por 2 é " + res);

        res = num2 % 3;
        System.out.println(num2 + "é divisivel por 3? " + res);
    }
}