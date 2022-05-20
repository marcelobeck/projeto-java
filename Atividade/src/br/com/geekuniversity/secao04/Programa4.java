package br.com.geekuniversity.secao04;

public class Programa4 {
    // If, else, else if
    public static void main(String[] args) {

        // Tipo de variável (Declarando e inicializando a variável)
        int numero = 1;

        if (numero > 5) {
            System.out.println("Sim, o numero " + numero + " é maior que 5");
        } else if (numero == 5) {
            System.out.println("Não, o numero " + numero + " é igual 5");
            // Verificar se o numero é par
        } else if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("Não, o número " + numero + " Não é maior que 5");
        }
    }
}
