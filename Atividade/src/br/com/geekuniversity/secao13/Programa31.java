package br.com.geekuniversity.secao13;

import br.com.geekuniversity.secao12.Aluno;

/*
- É um recurso que proporciona um bloqueio na criação de objetos.
- Não conseguimos instanciar objetos de uma classe abstrata;

//Classes Abstratas (Classes Bases, genéricas.) Ex: Pessoas
 */
// Server para que não seja instanciado no programa;
//A classe que herdar a classe abstrata tem que obrigatoriamente implementar os métodos abstratos;

public class Programa31 {
    public static void main(String[] args) {
        //Através do método toString retorna o nome e o ano de nascimento
        //Pessoa p1 = new Pessoa("Marcelo", 1999, "marcelombc12@gmail.com"); Não consigo instânciar a classe pessoa porque ela é abstrata
        //System.out.println(p1);

        Aluno aluno = new Aluno("Marcelo",1994, "1234567","marcelo1@gmail.com");
        System.out.println(aluno);

        aluno.outra_mensagem("Meu nome é " + aluno.getNome());

    }
}
