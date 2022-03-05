package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Conta;

public class FazDeposito implements Runnable{
    private Conta conta; // buscar a conta

    public FazDeposito(Conta conta) {
        this.conta = conta; //o contrutor recebendo um atributo e colocando o valor no = conta.
    }

    @Override
    public void run() {
        this.conta.depositar(100.0f); //quero que toda vez que executar adicione o valor.
    }
}
