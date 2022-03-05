package br.com.geekuniversity.secao20;
/*
Para executar métodos em paralelo, nossa classe
deve implementar a interface Runnable, e o metodo
que precisar ser executado em paralelo deve ser executado
dentro do método run.

 */

public class GeraRelatorio implements Runnable{

    //For 0 ate 10 milhões
    public void executar(){
        for(int i = 0; i < 1000000; i++){
            System.out.println(i + " - Gera Relatorio...aguarde");
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(i + " - Gera Relatorio...aguarde");
            }
        }
    }


