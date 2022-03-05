package br.com.geekuniversity.secao20;
//Thread Sincronizada
/*
O sincronismo ocorre pois durante a execução do método a thread
executa um 'lock' (bloqueio) da função para que outra thread
só passa executá-la pós a finalização da thread inicial.

 */

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa54 {
    public static void main(String[] args) throws InterruptedException { //Exceção de Interrupção
        Cliente cli1 = new Cliente(37,"Jolie", "Rua 1");
        Conta c1 = new Conta(1, 200, 300, cli1); //Saldo 500

        FazDeposito acao = new FazDeposito(c1); // Para construir objeto terá que passar a conta, porque no construtor foi passado a conta
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        //InterruptedException, e usada para retirar o processo que esta travando e executa a que for preciso.
        t1.start(); //500 + 100 -> 600 (Arrumar o problema para que ocorra isso), porque as threads não são sincronizadas
        t2.start(); //600 + 100 -> 700 (Arrumar o problema para que ocorra isso), porque as threads não são sincronizadas

        t1.join(); //avisando que a thread t1 deve 'se juntar' a um sincronizador. Esse sincronizador está no metodo depositar da classe Conta.
        t2.join(); //avisando que a thread t1 deve 'se juntar' a um sincronizador. Esse sincronizador está no metodo depositar da classe Conta.

        System.out.println(c1);
    }
}


