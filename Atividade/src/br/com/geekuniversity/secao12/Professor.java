package br.com.geekuniversity.secao12;
public class Professor extends Pessoa{
    private String matricula;

    //Contrutor
    public Professor(String nome, int ano_nascimento, String email, String matricula) {
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    //Polimorfismo
    //Overriding / Sobrescrita de método
    public String toString(){
        return super.toString() + "\nMatricula: " + this.matricula;
    }

    @Override
    public void outra_mensagem(String texto) { //Sobrescreve, realiza a implentação do método abstrato
        System.out.println(texto); //Aqui na classe filha, realiaza a implementação
    }

    //Overriding / Sobrescrita de método (As setas estão indicando que está ocorrendo (Overriding)
    public String getNome(){
        return "Professor: \n" + super.getNome();
    }

}