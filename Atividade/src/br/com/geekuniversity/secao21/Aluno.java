package br.com.geekuniversity.secao21;

public class Aluno {
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    //Implementação da classe Objetc
    @Override
    public boolean equals(Object obj){
        Aluno outro = (Aluno) obj; //Comparação de um Aluno com outro se tiver o mesmo nome
        return outro.getNome().equals(this.nome);
    }

    //Implementação da classe Objetc
    @Override
    public String toString() {
        return super.toString();
    }
}
