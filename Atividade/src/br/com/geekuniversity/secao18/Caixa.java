package br.com.geekuniversity.secao18;

//Caixa de objetos genéricos
public class Caixa {
    private Object[] objetos; //Criando um array de contas
    private int posicaoLivre;

    public Caixa(){
        objetos = new Object[100]; //até 100 objetos 0...99
        posicaoLivre = 0; //Todo array começa na posição 0, e vai até na posição (n - 1)
    }
    public void adicionar(Object nova){
        this.objetos[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }
    public Object pegar(int posicao){
        return this.objetos[posicao];
    }

}
