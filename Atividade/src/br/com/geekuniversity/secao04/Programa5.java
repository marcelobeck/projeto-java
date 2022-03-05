package br.com.geekuniversity.secao04;

//Operador ternário

public class Programa5 {

    public static void main(String[] args) {
        int valor = 3, numero;

        if (valor > 0) {
            numero = valor;
        }else {
            numero = 7;
        }

        // Operador ternário (? é uma pergunta, tipo valor é maior que 0 ?
        // Depois do ? vai receber o valor caso contrário recebe o 7
        // Mesma lógica que de cima
        numero = (valor > 0) ? valor : 7; // ou v ou f, so duas condições

        System.out.println(numero);

    }

}