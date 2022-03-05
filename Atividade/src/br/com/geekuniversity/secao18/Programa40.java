package br.com.geekuniversity.secao18;

//Realizando calculos com Math - Matemática
/*
A biblioteca Math possui vários métodos e constantes estáticos
para que possamos utilizar nos nossos programas.
Math.algumaCoisa, são as constantes disponibilizadas pela função
 */
public class Programa40 {
    public static void main(String[] args) {
        System.out.println(Math.E); // E, seria a constante.
        System.out.println(Math.PI); // PI, seria a constante.
        System.out.println(Math.sin(45)); // sin (seno de 45 graus), seria a constante.
        System.out.println(Math.round(Math.PI)); //Irá arrendondar para baixo e retorna um inteiro o valor do PI.
        System.out.println(Math.floor(Math.PI)); //Irá arrendondar para baixo e retorna um double ou float o valor do PI.
        System.out.println(Math.ceil(Math.PI)); //Irá arrendondar para cima o valor do PI.
        System.out.println(Math.pow(3, 2)); //Quero elevar 3 ao quadrado.
        System.out.println(Math.sqrt(9)); //Raiz quadrada de 9.
    }
}
