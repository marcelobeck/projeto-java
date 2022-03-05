package br.com.geekuniversity.secao21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Conjunto {

    // É um ArrayList de lista de Strings
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    // Construtor
    public Conjunto(){
        for(int i = 0; i < 26; i++){
            tabela.add(new LinkedList<String>());
        }
    }

    private int calculaIndice(String nome){
        return nome.toLowerCase().charAt(0) % 26;
    }

    public void adiciona(String nome){
        // 1- Verifica se o nome nao existe na lista
        if (!contem(nome)) {
            // 2- Calculando o indice do nome.
            int indice = calculaIndice(nome);
            // 3- Pegando a lista de acordo com o indice.
            List<String> lista = tabela.get(indice);
            // 4- Adiciona o nome na lista correta.
            lista.add(nome);
        }

    }

    private boolean contem(String nome){
        //1- Calculando o indice do nome.
        int indice = calculaIndice(nome);
        //2- Buscamos na tabela especifica do indice o nome.
        return tabela.get(indice).contains(nome); // metodo contains vai dizer se tem ou nao na lista.
    }

    public void remove(String nome){
        //1- Verificamos se o nome existe em alguma lista
        if(contem(nome)){
            //2- Calculamos o indice do nome
            int indice = calculaIndice(nome);
            //3- Pegamos a lista especifica do nome
            List<String> lista = tabela.get(indice);
            lista.remove(nome);
        }
    }

    @Override
    public String toString() {
        return tabela.toString();
    }
}
