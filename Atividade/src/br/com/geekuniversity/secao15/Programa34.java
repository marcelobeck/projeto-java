package br.com.geekuniversity.secao15;
//Atributos estáticos

/*
Atributos estáticos são atributos, onde os valores são compartilhados
entre as instâncias da classe.

Para utilizar um atributo estático, colocamos o nome da classe
junto ao atributo.

Exemplo:
NomeDaClasse.atributo;
 */

public class Programa34 {
    public static void main(String[] args) {
        //Instânciar um objeto
        Conta c1 = new Conta("Marcelo"); // c1 é uma instância da classe conta que compartilha todos os atributos estáticos
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Camilo");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        System.out.println(Conta.proximaConta()); //forma correta de acessar um atributo estático, não precisa instânciar.
        // se o método proximaConta não fosse estático, caso fosse int, ai precisaria de uma instância
        // System.out.println(c2.proximaConta());

    }
}
