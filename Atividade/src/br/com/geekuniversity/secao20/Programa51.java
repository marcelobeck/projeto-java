package br.com.geekuniversity.secao20;
//Simulação da geração de relatório + barra de tarefa
//Sem a utilização de threads (simulação para ver como acontece)

public class Programa51 {
    public static void main(String[] args) {

        /*
        Threads, para executar em pararelo, 1- O relatório sendo gerado;
        2- Informar na barra de progresso o que está sendo feito;
         */

        BarraDeProgresso barra = new BarraDeProgresso(); // Diferente da Threads que executa em pararelo, esta criada executa primeiro para depois executar a outra função.
        barra.executar();

        GeraRelatorio relatorio = new GeraRelatorio();//Aqui irá executar depois que terminar a barra de progresso
        relatorio.executar();

    }
}
