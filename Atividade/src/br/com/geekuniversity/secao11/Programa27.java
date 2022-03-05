package br.com.geekuniversity.secao11;
//Private

/*
Privado à própria classe.
Ou seja, só temos acesso ao atributo ou método privado dentro da prórpria classe
onde ele foi declarado.

 */
public class Programa27 {
    public static void main(String[] args) {
        Cliente cli = new Cliente(18,"Jolia","Rua Qualquer");

        System.out.println("Nome: " + cli.getNome());
        System.out.println("Endereco: " + cli.getEndereco());

        // cli.dizer_oi(); Não tem mais acesso porque é um método privado

    }

}