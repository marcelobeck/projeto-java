package br.com.geekuniversity.secao15;

public class Programa35 {
    // Métodos estáticos

    /*
    Um método estático, não depende de uma instância da classe para ser utilizado.

    Pode-se utilizar conforme:

    NomeDaClasse.metodo();

     */
    public static void main(String[] args) {
        Conta c1 = new Conta("Meu cliente");
        System.out.println("Número da conta: " + c1.getNumero());
        System.out.println("Cliente: " + c1.getCliente());

        System.out.println("A próxima conta será: " + Conta.proximaConta());

        }
    }

