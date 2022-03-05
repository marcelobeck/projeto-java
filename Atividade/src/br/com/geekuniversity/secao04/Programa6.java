package br.com.geekuniversity.secao04;

//Instrução Switch
public class Programa6 {
    public static void main(String[] args) {
        int numero = 7;

        switch (numero) { // switch recebe o valor como parametro, depois ele tem os casos
            case 1:
                System.out.println("O número é 1");
                break; // sair para não executar o restante
            case 3:
                System.out.println("O número é 3");
                break;
            case 5:
                System.out.println("O numero é 5");
                break;

            default:
                System.out.println("O numero é defaul");
        }
    }
}