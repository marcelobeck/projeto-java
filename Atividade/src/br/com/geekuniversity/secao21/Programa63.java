package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.Queue;

// Fila -> Implementação do Java
public class Programa63 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        System.out.println(fila);

        fila.add("Testando"); // inserir
        fila.add("Teste"); // inserir
        fila.add("Feito teste"); // inserir

        System.out.println(fila);

        String ret = fila.poll(); // remover
        System.out.println(ret);
    }
}
