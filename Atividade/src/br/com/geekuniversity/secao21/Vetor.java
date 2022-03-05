package br.com.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {

    // Criar um array de 100 alunos
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adiciona(Aluno aluno){
        this.garantirEspaco();
        //TODO receber um aluno
        this.alunos[total] = aluno;
        total = total + 1;
         // for(int i = 0; i < alunos.length; i++){
         //   if(alunos[i] == null){
         //       alunos[i] = aluno;
         //       break;
         //   }
         // }
    }
    // Sobrecarga de método (Dois métodos com os mesmo nos, mas com parâmetros diferentes)
    /*
        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 5;
        numeros[3] = 7;
        numeros[4] = 9;
        */
    // Método para mudar os valores de posição
    public void adiciona(int posicao, Aluno aluno) {
        this.garantirEspaco();
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = total - 1; i >= posicao; i =- 1){
            alunos[i + 1] = alunos[i];
        }
        alunos[posicao] = aluno;
        total++; //total = total + 1
    }

    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        //TODO recebe uma posição e devolve o aluno. Caso não retorna aluno na posição
        return this.alunos[posicao]; //Receber o aluno em cada indice
    }

        public void remove(int posicao){
            for(int i = posicao; i < this.total; i++){
                this.alunos[i] = this.alunos[i+1]; // O elemento da próxima posição vai vir para a anterior
            }
            total--;
        }

    public boolean contem(Aluno aluno) { // esse aluno que vem aqui é igual algum aluno que vem no If, caso sim retorna true, senão false.
        for (int i = 0; i < total; i++) {
            if(aluno.equals(alunos[i])){
            return true;
          }
       }
        return false;
    }

    public int tamanho(){
        //TODO devolve a quantidade de alunos no vetor
        return this.total;
    }

    @Override
    public String toString(){
        return Arrays.toString(this.alunos); // facilita a visualização do array
    }

    private boolean posicaoOcupada(int posicao){ // Pega a posição e verifica se esta ocupada
        return posicao >= 0 && posicao < total;
    }
    private void garantirEspaco(){
        //Verifica se o array alunos está cheio
        if(total == alunos.length){
            //Caso esteja cheio, cria um novo array com o dobro de tamanho do array anterior
            Aluno novoArray[] = new Aluno[alunos.length*2];
            //Copia os dados do array anterior para o novo array
            for(int i = 0; i< alunos.length; i++){
                novoArray[i] = alunos[i];
            }
            //Por útimo, atribuímos o novo array ao array original. A
            this.alunos = novoArray; // Está substituindo o array que era de 100 para o de 200
        }
    }
}











