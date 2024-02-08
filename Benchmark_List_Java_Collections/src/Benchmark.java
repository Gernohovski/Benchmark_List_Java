import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Benchmark {

    public static void main(String[] args) {
        //ArrayList que servirá de base para o nosso estudo de caso
        List<Integer> arrayListBenchmark = new ArrayList();

        //Invoca o método de realização do benchmark completo (inserção, busca e remoção)
        realizarBenchmark(arrayListBenchmark, "ArrayList");

        //LinkedList que servirá de base para o nosso estudo de caso
        List<Integer> linkedListBenchmark = new LinkedList();

        //Invoca o método de realização do benchmark completo (inserção, busca e remoção)
        realizarBenchmark(linkedListBenchmark, "LinkedList");
    }

    public static void realizarBenchmark(List<Integer> listBenchmark, String tipoLista) {
        //Instância do objeto da classe de geração de números pseudo randômicos
        Random rand = new Random();

        //Atribui a variável tempoInicial o tempo atual que a aplicação demandou
        long tempoInicial = System.currentTimeMillis();

        //Variável de controle de laços de repetição (for)
        int i;

        //Laço de repetição para efetuar a inserção de 10000000 números na implementação de lista
        for(i = 0; i < 10000000; ++i) {
            listBenchmark.add(rand.nextInt(100));
        }

        //Imprime no console o tempo demandado pela aplicação para a inserção de 10000000 números
        System.out.println("A inserção no(a) " + tipoLista
                + " de 10000000 números demorou: " + (System.currentTimeMillis() - tempoInicial) + "ms");

        //Atribui a variável tempoInicial o tempo atual que a aplicação demandou
        tempoInicial = System.currentTimeMillis();

        //Laço de repetição para efetuar a busca de 100000 números na implementação de lista
        for(i = 0; i < 100000; ++i) {
            listBenchmark.contains(rand.nextInt(100));
        }

        //Imprime no console o tempo demandado pela aplicação para a busca de 100000 números
        System.out.println("A busca no(a) " + tipoLista +
                " de 100000 números utilizando o método .contains demorou: "
                + (System.currentTimeMillis() - tempoInicial) + "ms");

        //Atribui a variável tempoInicial o tempo atual que a aplicação demandou
        tempoInicial = System.currentTimeMillis();

        //Laço de repetição para efetuar a remoção de 10000 números na implementação de lista
        for(i = 0; i < 10000; ++i) {
            listBenchmark.remove(i);
        }

        //Imprime no console o tempo demandado pela aplicação para a busca de 10000 números
        System.out.println("A remoção no(a) " + tipoLista
                + " de 10000 números utilizando o método .remove demorou: "
                + (System.currentTimeMillis() - tempoInicial) + "ms\n");
    }
}
