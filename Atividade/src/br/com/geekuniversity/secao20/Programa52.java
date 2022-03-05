package br.com.geekuniversity.secao20;
//Simulação da geração de relatório + barra de tarefa
//Com a utilização de threads (simulação para ver como acontece)

//

public class Programa52 {
    public static void main(String[] args) {
        // Thread irá executar a sequência de acordo com o processado
        // Nunca será na mesma sequência, mas ambas as tarefas finalizam ao mesmo tempo
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra); // Aqui executará em pararelo, um pouco t1, outro pouco t2.
        t1.start();

        // Thread irá executar a sequência de acordo com o processado
        // Nunca será na mesma sequência, mas ambas as tarefas finalizam ao mesmo tempo
        GeraRelatorio relatorio = new GeraRelatorio();
        Thread t2 = new Thread(relatorio); // Aqui executará em pararelo
        t2.start();

    }
}
