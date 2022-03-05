package br.com.geekuniversity.secao05;
//JDK -> Biblioteca para desenvolvimento e execução do Java.

// Foreach (for significa para, e o each significa cada) Não tem uma condição de parada
public class Programa10 {

    public static void main(String[] args) {
        String nome = "Testando estrutura de repetição";

        // Para cada um dos caracteres da String, imprima o caracter
        for (char letra : nome.toCharArray()) { // o char é para cada caracter
            //	System.out.println(letra); // imprimi e pula uma linha
            System.out.print(letra);

        }

    }

}