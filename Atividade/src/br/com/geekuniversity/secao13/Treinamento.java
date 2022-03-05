package br.com.geekuniversity.secao13;
//Classe treinamento é uma classe genérica, ai colocamos como abstrata
//Template Método

/*
- Final é um modificador de acesso que, faz com que
o elemento que esteja utilizando, não possa ser extendido/reescrito.

 */

public abstract class Treinamento { //Se no lugar do Astract fosse Final, não poderia estender.
    //Templete Método
    public final void treinoDiario() { //não pode sobrescrever
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico(); //Deve ser implementada (Aqui Treino Inicial, vai ser diferente que o Treino Final)

    public abstract void jogoTreino(); //Deve ser implementada (Aqui Treino Inicial, vai ser diferente que o Treino Final)

    public final void treinoTatico() { // Aqui vai ser igualpackage br.com.geekuniversity.secao13;

        //Classe treinamento é uma classe genérica, ai colocamos como abstrata
        //Template Método

    /*
      - Final é um modificador de acesso que, faz com que
        o elemento que esteja utilizando, não possa ser extendido/reescrito.

    */
    }
}