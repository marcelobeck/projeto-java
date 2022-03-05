package br.com.geekuniversity.secao21;
/**

 Classe que representa uma célula (container) onde
 teremos o objeto (valor) e uma celula que será a ligação
 para o próximo.

@author Marcelo
 */

public class Celula {
    private Object elemento; // Object porque porque pode ser ums String, inteiro, conta, cliente. Deixar genérico o suficiente
    //[0][3][1][2][5][4]
    private Celula proximo; //Apontar para próxima célula [0][1][2][3]

    private Celula anterior;

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    //Este construtor está passando para o elemento de cima.
    public Celula(Object elemento){
        this(elemento,null);
    }

    public Celula getProximo(){
        return this.proximo;
    }
    public void setProximo(Celula proximo){
        this.proximo = proximo;
    }
    public Object getElemento(){
        return this.elemento;
    }
    public Celula getAnterior(){
        return this.anterior;
    }
    public void setAnterior(Celula anterior){
        this.anterior = anterior;
    }





}
