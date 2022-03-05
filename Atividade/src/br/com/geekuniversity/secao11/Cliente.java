package br.com.geekuniversity.secao11;
public class Cliente implements Comparable{
    //  public String nome; //Tonar público para o proveto inteiro
    // public String endereco;

    private String nome;
    private String endereco;
    private int idade;

    // Criando um construtor, aqui já não tenho mas um construtor vazio, quando criar um objeto já vem carregado
    public Cliente(int idade, String nome, String endereco){
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;

        //  this.dizer_oi(); // Só quero que seja chamado aqui dentro do construtor como público
    }

    private void dizer_oi(){ // só terá acesso dentro desta classe
        System.out.println(this.nome + " está dizendo oi....");
    }

    public String getNome(){ // Criando métodos públicos para o acesso a outra classe
        return this.nome;
    }
    public String getEndereco(){ // Criando métodos públicos para o acesso a outra classe
        return this.endereco;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Object outro) {
        Cliente aux = (Cliente)outro;
        if(this.idade < aux.idade){
            return -1;
        }else if(this.idade > aux.idade){
            return 1;
        }else {
            return 0;
        }
    }
}