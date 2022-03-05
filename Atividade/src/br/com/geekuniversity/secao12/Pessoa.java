package br.com.geekuniversity.secao12;

// Polimorfismo
//Overriding / Sobrescrita de método;
/*
- Essa classe Pessoa serviu de base para a classe Aluno
- Poderia ter a classe Pessoa e deixar só Aluno, até poderia
só que tem pessoa que não tem ra.

-Está classe é reconhecido como:
-Classe base;
-Classe mãe;
-Classe pai;
-Super classe;
-Classe genérica, porque é um termo pessoa, vários tipos de pessoas, (aluno), seria classe especifica.

 */
//Manipuladores de atributos (Getters e Settes)

/* Agora como classe abstrata
- Desta forma, impossibilitamos a criação de objetos desta classe.
- Uma classe abstrata pode ter:
       -Atributos;
       -Métodos;
       -Métodos abstratos;

Métodos abstratos:
    - São métodos que não possuem implementação, possuem apenas declaração e obrigatóriamente
    que herdarem desta classe com método abstrato precisa implementar estes métodos.

    -Implementação é tudo que está dentro das chaves
    -Declaração do método (public Pessoa(String nome, int ano_nascimento, String email) )
*/
public abstract class Pessoa {
    private String nome; //Aqui só tem acesso a esta classe
    private int ano_nascimento;
    private String email;

    // Esses dois métodos "Pessoa" é uma sobrecarga de método, pode criar vários métodos assim, mas com diferentes parametros.
    public Pessoa() {

    }

    //Mátodos Construtor. Aqui estou obrigando a informar o nome
    public Pessoa(String nome, int ano_nascimento, String email) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }
    //Métodos GETs e SETs
    //Terei acesso a outra classe atraves desses metodos GET e SET
    public String getNome() { //Pegando o nome e devolvendo o nome
        return this.nome;
    }

    public void setNome(String nome) { // seta o valor, coloca, mas pra isso precisa receber o valor
        this.nome = nome;
    }

    public int getAno_nascimento() {
        return this.ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Polimorfismo
    //Overriding / Sobrescrita de método (As setas estão indicando que está ocorrendo (Overriding), porque herda da classe pai (Pessoa)
    public String toString() { // O método toString foi herdado do Object (Pessoa), mas poderia fazer com o getNome, a seta indica que é Overriding.
        return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;

    }
    //Overloading / Sobrecarga de método, ele é conhecido porque é criado da própria classe, como sobrecarga de método
    // Esse três métodos (mensagem) é a sobrecarga de método, nomes iguais mais com parametros diferentes.
    public void mensagem() {
        System.out.println("Essa é minha primeira mensagem...");
    }

    public void mensagem(String msg){
        System.out.println(msg);
    }
    public void mensagem(String msg, int num){
        System.out.println(msg + num); // + seria concatenar
    }
    //Declaração de um método abstrato
    public abstract void outra_mensagem(String texto); // Finaliza com ; não tem implementação
}
