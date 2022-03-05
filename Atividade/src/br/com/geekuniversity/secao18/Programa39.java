package br.com.geekuniversity.secao18;

//Object: A mãe de todas as classes (public class nomeDaClasse) ou (public class nomeDaClasse extends Object)

/*
A classe Object, faz parte do pacote (java.lang). String, por exemplo, não precisa de import.
Obs: Só faz import quando não é Java Lang. Ex: (import java.util.Scanner)

public class Programa39 extends Object{ Por padrão é assim que as classes são herdadas pela classe Object
}
 */

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa39 {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente(18,"Jolie", "Rua 1, 234");
        Cliente cli2 = new Cliente(18,"Jones", "Rua 2, 345");

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 200,300,cli2);

        Caixa prateleira = new Caixa();

        // Quando manda imprimir o toString da classe pai com o método sobrescrito poderá ficar da seguinte forma:
        System.out.println(c1.toString()); // Mesma coisa fazendo assim: System.out.println(c1)
        System.out.println(c2.toString());

        // Verifica se são os mesmos Objetos (This da classe conta seria c1, o c2 seria o objeto)
        if(c1.equals(c2)){
            System.out.println("São a mesma conta");
        }else {
            System.out.println("São as contas diferentes");
        }

        prateleira.adicionar(c1); //posição 0 -> tem getSaldo();
        prateleira.adicionar(c2); //posição 1 -> tem getSaldo();

        // Conta conta = prateleira.pegar(0);
        // Foi feito uma classe genérica chama "Caixa" (para usar pra tudo), aí aqui faz um Casta pra chamar a Conta e dizer que naquela posição tem uma conta.
        System.out.println(((Conta)prateleira.pegar(0)).getSaldo()); //Cast (está dizendo tenho certeza que está na posição 0)

        prateleira.adicionar(cli1); //posição 2 -> não tem getSaldo();

        // Objeto não tem o getNome, ai faz o Cast para dizer que ele é um cliente
        System.out.println(((Cliente)prateleira.pegar(2)).getNome());

        // Outro exemplo de instanceof
        // Poderia colocar um Cast para dizer confia em min sou programador

        if((Object) cli1 instanceof Conta){ //Se for olhar são contas diferentes
            System.out.println("O objeto é do tipo Conta");
        }else {
            System.out.println("O objeto não é do tipo conta");
        }

        //Aqui funciona
        if(c1 instanceof Conta){
            System.out.println("O objeto é do tipo Conta");
        }

    }
}