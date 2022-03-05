package br.com.geekuniversity.secao14;

public class Ventilador implements IEletronico{
    private boolean ligado = false; //Aqui o ventilador já vem desligado.

    @Override
    public void ligar() {
        if(!this.ligado){ // Verifica se está desligado, se não está ligado
            this.ligado = true; // se tiver desligado aqui ele liga
            System.out.println("Liguei o aparelho...");
        }

    }

    @Override
    public void desligar() {
        if(this.ligado){ // Aqui se for ligado ele manda desligar
            this.ligado = false;
            System.out.println("Desliguei o aparelho...");
        }

    }
}
