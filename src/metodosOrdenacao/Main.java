package metodosOrdenacao;

/**
 * @author Jackson Meires
 */
public class Main {

    public static void main(String[] args) {
        int tamanho = 100000;
        int vetor[] = Metodos.gerarVetorRandomico(tamanho);

        System.out.println("Vetor:");
        //  Metodos.printVetor(vetor);

        //######################## Inicio InsertionSort ########################
        System.out.println("\nMetodos\n-------------InsertionSort-------------");
        long tempoInicialIS = System.currentTimeMillis();

        int vIS[] = Metodos.InsertionSort(vetor);

        long tempoFinalIS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalIS - tempoInicialIS) / 1000d);

        Metodos.testarOrdenacao(vIS);
        //Metodos.printVetor(vIS);
        //######################## Fim InsertionSort ###########################
        //######################## Inicio SelectionSort ########################
        System.out.println("-------------SelectionSort-------------");

        long tempoInicialSS = System.currentTimeMillis();
        int vSS[] = Metodos.SelectionSort(vetor);

        long tempoFinalSS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalSS - tempoInicialSS) / 1000d);

        Metodos.testarOrdenacao(vSS);
//        Metodos.printVetor(vSS);
        //######################## Fim SelectionSort ###########################

        //######################## Inicio BubbleSort ###########################
        System.out.println("-------------BubbleSort-------------");
        long tempoInicialBS = System.currentTimeMillis();

        int vBS[] = Metodos.BubbleSort(vetor);

        long tempoFinalBS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalBS - tempoInicialBS) / 1000d);

        Metodos.testarOrdenacao(vBS);
//        Metodos.printVetor(vBS);

        //######################## Fim BubbleSort #############################
        //######################## Inicio ShellSort ############################
        System.out.println("-------------ShellSort-------------");
        long tempoInicialShellS = System.currentTimeMillis();

        int vShellS[] = Metodos.ShellSort(vetor);

        long tempoFinalShellS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalShellS - tempoInicialShellS) / 1000d);

        Metodos.testarOrdenacao(vShellS);
//        Metodos.printVetor(vShellS);
        //######################## Fim ShellSort ############################

    }

}
