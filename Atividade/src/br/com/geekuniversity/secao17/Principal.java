package br.com.geekuniversity.secao17;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

import java.util.Scanner;

/*
Gerando executáveis jar

JAR - Java Archive

Archive - Arquivo compactado Java

 */
public class Principal {
    // Criado as variáveis aqui fora porque possa acessar em qualquer método.
    // Se usar a variável como static, lá no main terá que usar como static.

    static Cliente cliente = new Cliente(12,"Angelina", "Rua da paz, 45");
    static Conta conta = new Conta(1, 200, 300,cliente);
    static Scanner teclado = new Scanner(System.in);

    public static void depositar(){
        System.out.println("======= Depósito =========");
        System.out.println("Informe o valor para depósito: ");
        float valor = teclado.nextFloat();
        if(valor > 0){
            conta.depositar(valor); // se for maior que 0 passamos o valor como parametro.
            System.out.println("Depósito efetuado com sucesso.");
        }else {
            System.out.println("O valor precisa ser positivo");
        }

    }
    public static void sacar(){
        System.out.println("========= Saque ==========");
        System.out.println("Informar o valor para saque: ");
        float valor = teclado.nextFloat();
        if(valor > 0){
            conta.sacar(valor);
        }else{
            System.out.println("O valor precisa ser positivo. ");
        }
    }

    public static void consultar(){
        System.out.println("Seu saldo é " + conta.getSaldo());
    }


    public static void main(String[] args) { // O ideial é deixar a função main mais enchuta possível.

        int opcao = 0;
        System.out.println("Bem-vindo ao Banco Geek");

        do{ //Primeiro vai validar os dados. Porque primeiro queremos que a função seja executada.
            System.out.println("Seleciona uma opção abaixo");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Concultar Saldo");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1: // 1 é o valor do tipo Depositar
                    depositar(); // chama o método
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    consultar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }while (opcao > 0);
        teclado.close(); // no final do programa o teclado seja fechado
    }
}
