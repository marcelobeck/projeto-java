package br.com.geekuniversity.secao01;

import br.com.geekuniversity.secao11.Cliente;

public class Programa26 {
    public static void main(String[] args) {
        Cliente cli = new Cliente(18,"Jolia", "Rua da barra");

        //  System.out.println("Nome: " + cli.nome); Agora os atributos são privado
        //  System.out.println("Nome: " + cli.endereco); Agora os atributos são privado
    }
}
