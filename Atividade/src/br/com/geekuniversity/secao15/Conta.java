package br.com.geekuniversity.secao15;

public class Conta {//Criação de um objeto
    private int numero;
    private String cliente;

    //Criar um atributo static
    public static int contador = 1;


    public Conta(String cliente){
        this.numero = contador; // o número vai incrementar de forma automática, o contador recebe o valor atualizado.
        this.cliente = cliente; // o this ele referencia do parametro
        Conta.contador = Conta.contador + 1; // this funciona (aparece amarelo), mas precisa acessar de forma estática com o nome da classe.

    }
    public int getNumero(){
        return this.numero;
    }
    public String getCliente(){
        return this.cliente;
    }
    public static int proximaConta(){
        return Conta.contador;
    }
  }

