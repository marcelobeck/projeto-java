package br.com.geekuniversity.secao19;

import br.com.geekuniversity.secao11.Cliente;

import java.util.ArrayList;
import java.util.Collections;

//Listas
public class Programa47 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cli1 = new Cliente(19,"Bolia","Rua 123");
        Cliente cli2 = new Cliente(18,"Aones","Rua 1234");
        Cliente cli3 = new Cliente(20,"Cones","Rua 12345");

        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);

        Collections.sort(clientes);

        for(Cliente cliente : clientes){
            System.out.println(cliente); //Sem o toString implementado vai da o endereço de memória

        }
    }

}

