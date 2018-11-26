//Primeira Solução com Leitores e Escritores
public class Solucao01  implements Runnable {
	private int writers = 100;
	private int readers = 0;

    @Override
    public void run() {

        //entrar na base

        //fazer 100 escritas
        /*
            Para cada acesso aleatorio na base escrever "MODIFICADO" na posicao
            depois do ultimo acesso, antes de sair da base, deve esperar 1ms
            NOTA: essa thread nao deve acabar dps da principal
            usar join()
         */


    }
}
