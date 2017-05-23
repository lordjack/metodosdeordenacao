package metodosOrdenacao;

/**
 * @author Jackson Meires
 */
public class Main {

    public static void main(String[] args) {
        int tamanho = 50000;
        int vetor[] = Metodos.gerarVetorRandomico(tamanho);

        //######################## Inicio InsertionSort ########################
        System.out.println("\nMetodos\n-------------InsertionSort-------------");
        long tempoInicialIS = System.currentTimeMillis();

        int vIS[] = Metodos.InsertionSort(vetor);

        long tempoFinalIS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalIS - tempoInicialIS) / 1000d);

        Metodos.testarOrdenacao(vIS);
        //  Metodos.printVetor(vIS);
        //######################## Fim InsertionSort ###########################
        //######################## Inicio SelectionSort ########################
        System.out.println("-------------SelectionSort-------------");

        long tempoInicialSS = System.currentTimeMillis();
        int vSS[] = Metodos.SelectionSort(vetor);

        long tempoFinalSS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalSS - tempoInicialSS) / 1000d);

        Metodos.testarOrdenacao(vSS);
        //  Metodos.printVetor(vSS);
        //######################## Fim SelectionSort ###########################

        //######################## Inicio BubbleSort ###########################
        System.out.println("-------------BubbleSort-------------");
        long tempoInicialBS = System.currentTimeMillis();

        int vBS[] = Metodos.BubbleSort(vetor);

        long tempoFinalBS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalBS - tempoInicialBS) / 1000d);

        Metodos.testarOrdenacao(vBS);
        //Metodos.printVetor(vBS);
        //######################## Fim BubbleSort #############################
        //######################## Inicio ShellSort ############################
        System.out.println("-------------ShellSort-------------");
        long tempoInicialShellS = System.currentTimeMillis();

        int vShellS[] = Metodos.ShellSort(vetor);

        long tempoFinalShellS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalShellS - tempoInicialShellS) / 1000d);

        Metodos.testarOrdenacao(vShellS);
        //Metodos.printVetor(vShellS);
        //######################## Fim ShellSort ############################

        //######################## Inicio MergeSort ############################
        System.out.println("-------------MergeSort-------------");
        long tempoInicialMS = System.currentTimeMillis();

        int vMergeS[] = Metodos.MergeSort(vetor);

        long tempoFinalMS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalMS - tempoInicialMS) / 1000d);

        Metodos.testarOrdenacao(vMergeS);
        //Metodos.printVetor(vMergeS);
        //######################## Fim MergeSort ############################

        //######################## Inicio HeapSort ############################
        System.out.println("-------------HeapSort-------------");
        long tempoInicialHS = System.currentTimeMillis();

        Metodos.HeapSort(vetor);

        long tempoFinalHS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalHS - tempoInicialHS) / 1000d);

        //######################## Fim HeapSort ############################
        
        //######################## Inicio QuickSort ############################
        System.out.println("-------------QuickSort-------------");
        long tempoInicialQS = System.currentTimeMillis();

        Metodos.QuickSort(vetor, 0, vetor.length - 1);

        long tempoFinalQS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalQS - tempoInicialQS) / 1000d);

        //######################## Fim QuickSort ############################
        //######################## Inicio RadixSort ############################
        System.out.println("-------------RadixSort-------------");
        long tempoInicialRS = System.currentTimeMillis();

        Metodos.RadixSort(vetor);

        long tempoFinalRS = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinalRS - tempoInicialRS) / 1000d);

        //######################## Fim RadixSort ############################
    }

}
