package br.com.geekuniversity.secao12;

//Estamos falando que Aluno é uma Pessoa
/*
Quando uma classe herda de outra classe ela ganha:
    -Ganha todos os atributos e métodos da classe herdada.

- Está classe é reconhecida como:
- Classe específica;
- Sub-classe de pessoa;
- classe filha;
 */
public class Aluno extends Pessoa{
    // private String nome; (Aqui pode tirar porque repetiu com os atributos da classe Pessoa)
    // private int ano_nascimento; (Aqui pode tirar porque repetiu com os atributos da classe Pessoa)
    private String ra;

    public Aluno(String nome, int ano_nascimento, String ra, String email){
        // this.nome = nome;
        //  this.ano_nascimento = ano_nascimento;
        // É como se tivesse fazendo isso o super: Pessoa(nome, ano_nascimento);
        super(nome, ano_nascimento, email); //super classe
        this.ra = ra;
    }

    /*
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno_nascimento(){
        return ano_nascimento = ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento){
        this.ano_nascimento = ano_nascimento;
    }
 */
    public String getRa(){
        return ra = ra;
    }

    public void setRa(String ra){
        this.ra = ra;
    }

    //Usar o Polimorfismo
    //Overriding / Sobrescrita de método (As setas estão indicando que está ocorrendo (Overriding)
    //a variável ra, irá sobrescrever(adicionar) junto com os atributos da classe super(Pessoa)
    public String toString(){ //não da classe Object "aluno" e sim da classe Pessoa
        return super.toString() + "\nR.A.: " + this.ra;
        //super porque é para mexer com a super classe. toString da super-classe. E to concatenando com RA que está nessa classe.
    }

    @Override //Sobrescreve, realiza a implentação do método abstrato
    public void outra_mensagem(String texto) { //Aqui na classe filha, realiaza a implementação
        System.out.println(texto);

    }

    //Overriding / Sobrescrita de método (As setas estão indicando que está ocorrendo (Overriding)
    public String getNome(){ //não da classe Object "aluno" e sim da classe Pessoa
        return "Aluno: \n" + super.getNome();
    }
}