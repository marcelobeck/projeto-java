package br.com.geekuniversity.secao21;

//Listas Duplamente Ligada
public class Programa59 {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adiciona("Teste 1");
        System.out.println(lista);
        lista.adiciona("Teste 2");
        System.out.println(lista);
        lista.removeDoComeco();
        System.out.println(lista);



    }
}
