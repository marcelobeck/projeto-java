package br.com.geekuniversity.secao21;
// Filas

/*
- Todo elemento entra no final da fila.

- O primeiro elemento a entrar é também o primeiro a sair.

-> [0][1][2][3][4]

 */

public class Programa62 {
    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println(fila); // Se executar assim irá aparecer o endereço da memória, tem que implementar o TOString

        fila.adiciona("Joao");
        fila.adiciona("Fabricio");
        fila.adiciona("Carlos");

        System.out.println(fila);

        String ret = fila.remove();
        System.out.println(ret);

        System.out.println(fila);

        System.out.println(fila.vazia());


    }
}
