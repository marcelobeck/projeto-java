package br.com.geekuniversity.secao09;

// Construtor

/*
- O construtor de uma classe sempre tem o mesmo nome da classe;
- Por padrão, a JVM - Java Virtual Machine, cria em tempo de execução,
um construtor padrão -  um construtor vazio Pessoa();
- Podemos ter mais de um construtor na classe;

 */
public class Programa24 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); //(Método)da classe para contruir objeto, Construtor, Pessoa()

        pessoa1.nome = "Jones";
        pessoa1.email = "jones@gmail.com";
        pessoa1.ano_nascimento = 1987;
        pessoa1.imprime_informacoes(); // todo obejto pode utilizar o metodo

        // No próprio construtor pode passar os valores
        Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1987);
        pessoa2.imprime_informacoes(); //todo objeto pode utilizar o metodo

    }
}