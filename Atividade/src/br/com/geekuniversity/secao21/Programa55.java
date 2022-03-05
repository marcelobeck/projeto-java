package br.com.geekuniversity.secao21;
//Armazenamento sequencial

//Basicamente uma revisão de vetores e matrizes
/*
int numero[] = new int[5];

numeros[0] = 1;
numeros[1] = 3;
numeros[2] = 5;
numeros[3] = 7;
numeros[4] = 9;
 */

public class Programa55 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Marcela");
        Aluno a2 = new Aluno("Julia");

        Vetor lista = new Vetor();

       // lista.adiciona(a1);
       // lista.adiciona(a2);

        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adiciona(a1);
        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adiciona(a2);
        System.out.println("Total de alunos: " + lista.tamanho());

        System.out.println(lista); // irá usar o toString, da classe Vetor

        System.out.println(lista.contem(a1));

        try{
            System.out.println(lista.pega(101));
        }catch (IllegalArgumentException e) {
            System.out.println("o aluno da posição 101 não existe");
            System.out.println(e.getMessage()); // Visualizar o erro.
        }

        // Para mudar os valores das posições
        Aluno a3 = new Aluno("Maria");
        try{
            lista.adiciona(101, a3);
        }catch (IllegalArgumentException e){
            System.out.println("A posição 101 é inválida");
        }

        lista.remove(0);
        System.out.println(lista);
    }
}
