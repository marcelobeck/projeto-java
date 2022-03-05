package br.com.geekuniversity.secao13;

public class TreinamentoInicioDaTemporada extends Treinamento {
    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico de inicio da temporada...");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino de inicio da temporada...");
    }
}
