package br.com.geekuniversity.secao09;

public class Programa23 {

    public static void main(String[] args) {
        int numero = 4;

        //Declaracao do objeto
        Produto p0;

        //Criando o objeto mais o nome do objeto;
        //Declaracao e instanciando/inicializacao do objeto;
        //Produto p1 = new Produto(); // p1-> instancia do objeto / objeto
        //System.out.println(p1); //Dica: Endereco onde esta locado na memoria

        //p0 = new Produto(); //Dica: Endereco onde esta locado na memoria
        //System.out.println(p0);

        Produto p1 = new Produto(); // Produto() o construtor, constroi a instancia do objeto
        p1.nome = "Notebook";
        p1.preco = 2.367f; //f por causa do float
        p1.desconto = 15.0f;

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto);

        p0 = new Produto(); //() o construtor
        p0.nome = "Caneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5;
        System.out.println(""); // Pula uma linha, ln pula uma linha
        System.out.println(p0.nome);
        System.out.println(p0.preco);
        System.out.println(p1.desconto);

        Pessoa pessoal = new Pessoa(); // () o construtor
        pessoal.nome = "Joao";
        pessoal.email = "test@gmail.com";
        pessoal.ano_nascimento = 1997;


        System.out.println("=====Pessoas======");
        System.out.println("Nome:" + pessoal.nome);
        System.out.println("E-mail: " + pessoal.email);
        System.out.println("Ano de Nascimento: " + pessoal.ano_nascimento);



    }
}