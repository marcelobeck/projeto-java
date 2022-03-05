package br.com.geekuniversity.secao11;

/*
//ENCAPSULAMENTO
-Não acessar outra classe com a mesma variável,
evitar que altere a variável diretamente;

Capsula (Fechar algo)

 */
//PUBLIC é um modificador de acesso que torna público um determinado objeto que pode ser instanciado em todo o projeto;
//se chamar essa classe em outro pacote terá que usar o (importe) EX: Na seção 1
//as classes são sempre public;
//os atributos podem ser (PUBLIC, PRIVATE, PROTECTED) normalmente é private;
public class Programa25 {
    public static void main(String[] args) {
        Cliente joao = new Cliente(18,"Joao da silva", "Rua da paz, 45");
        Cliente maria = new Cliente(18,"Maria da silva", "Rua da paz, 45");

        //Cliente a = new Cliente(); vai da erro porque não está vazio o construtor

        Conta conta_joao = new Conta(1, 100.0f,200.0f, joao);
        Conta conta_maria = new Conta(2, 300.0f, 500.0f,maria);

        System.out.println("Saldo no Joao (Antes do Saque): " + conta_joao.getSaldo()); // Ao invés de acessar os atributos saldo vamos acessar o getsaldo
        System.out.println("Saldo no Joao: " + conta_maria.getSaldo());

        conta_joao.sacar(150);
        System.out.println("Saldo do João (Depois do Saque): " + conta_joao.getSaldo());

        // conta_joao.saldo = -9000;  (se tentar forçar aqui colocando o valor ele não deixa)
        // a variável saldo não acessa porque é privado. Só o getsaldo consegue acessar

        // conta_joao.saldo = -900; // Problema aqui, por isso usar o encapsulamento que seria o (private) na variável saldo da classe Conta.
        // System.out.println("Saldo do João (Depois do Saque Forçado): " +conta_joao.getSaldo());

        //conta_joao.limite = 1000000.00f;
        // System.out.println("Saldo do João (Depois de aumentar o Limite forçado): " + conta_joao.limite);
        //  System.out.println("Saldo do João: " + conta_joao.getSaldo());


    }
}