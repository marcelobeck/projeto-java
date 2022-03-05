package br.com.geekuniversity.secao19;
//HashMap
// Não aceita chaves duplicadas, mas valores sim

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

import java.util.HashMap;
import java.util.Map;

/*
A classe HashMap implementa a interface Map e trabalha com chave/valor

 */
public class Programa49 {
    public static void main(String[] args) {
        //Define a "chave" e o "valor"
        Map<String, Conta> contas = new HashMap<String, Conta>(); //HashMap, implementa a interface Map

        Cliente cli1 = new Cliente(24, "Jolia", "Rua 1");
        Cliente cli2 = new Cliente(34, "Jones", "Rua 2");

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 400, 700, cli2);

        contas.put("Pessoa Fisica" ,c1); // chave(Pessoa Fisica) e valor(c1). O put é o método de adicionar
        contas.put("Pessoa Jurídica", c2);
        contas.put("Pessoa física", c2);

        System.out.println(contas.size());
        //System.out.println(contas.get("Pessoa Fisica"));

    }
}
