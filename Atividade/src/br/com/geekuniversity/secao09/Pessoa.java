package br.com.geekuniversity.secao09;

//Construtores
/*
- Sempre, um construtor vazio tem a seguinte forma:

public NomeDaClasse(){
}
*/
public class Pessoa {
    String nome, email;
    int ano_nascimento;

    //Construtor vazio, sem parâmetros
    public Pessoa() {

    }

    // O (pseudo-)método construtor determina que ações devem ser executadas quando da criação de um objeto.
    //Um método construtor com parâmetos
    public Pessoa(String nome, String email, int ano_nascimento){
        this.nome = nome; //this == este objeto, ele diz nesse Objeto pessoa no atributo nome
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informacoes(){
        System.out.println("Nome:" + this.nome);
        System.out.println("E-mail:" + this.email);
        System.out.println("Ano de Nascimento:" + this.ano_nascimento);
    }
}
