package br.com.geekuniversity.secao13;
//Template Método

/*
- O padrão Template Método define o esqueleto de um algoritmo dentro de um método,
transferindo alguns de seus passos para as subclasses. O template método permite que
as subclasses "classes filhas" redefinam certos passos de um algortimo sem alterar a estrutura do
próprio algortimo.

Algoritmos são "receitas" passo-a-passo para resolver algum problema.

receber numero;
retornar numero * numero;

metodo principal(){
    passo1();
    passo2();
    passo3();
}

 */
public class Programa32 {
    public static void main(String[] args) {
        TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
        tit.treinoDiario();

        TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
        tft.treinoDiario();

    }
}
