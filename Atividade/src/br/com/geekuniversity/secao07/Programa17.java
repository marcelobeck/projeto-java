package br.com.geekuniversity.secao07;

// Vetores parte 2
public class Programa17 {
    public static void main(String[] args) {

        //Declaração e definição de tamanho do vetor
        int numeros[] = new int[10]; // Depois de definido o tamanho do array não consegue aumentar e nem diminuir
        //Depois que colocar o tipo de dados não consegue alterar, usar sempre o int, se foi declarado ele
        // Mudar só o 10 para outro valor, o length já atualiza tudo sem precisar colocar o valor fixo
        System.out.println("Tamanho do vetor: " + numeros.length);


        for (int i = 0; i < numeros.length; i++) {
            //posição numeros[0] = i + 3;
            numeros[i] = i + 3;
            //posição numeros[9] = i + 3;
        }

        System.out.println(numeros[0]); //primeiro elemento
        System.out.println(numeros[9]); //segundo elemento

        /* 0...9
         * numeros[10] = 42;
         * System.out.println(numeros[10]);
         *
         * Os vetores/arrays possuem tamanho fixo e não podem ser aumentados/diminuidos
         */
        numeros[0] = 7;
        System.out.println(numeros[0]); //primeiro elemento


        /* numeros[0] = 23.4f;
         *
         * Os vetores/arrays possuem tipos de dados fixos
         * e não aceitam tipos variados.
         */
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)Math.round(Math.random() * 10);
            //Math é a biblioteca matematica do Java. Math.round é um arredondamento, o x10 é só pra ter um numero maior


        }

        System.out.println(numeros[0]); //primeiro elemento
        System.out.println(numeros[9]); //segundo elemento

        // 0...1 double
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.round(Math.random() * 10));

        for (int i : numeros) {
            System.out.println(i);

        }

    }

}
