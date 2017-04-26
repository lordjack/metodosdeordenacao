package metodosOrdenacao;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jackson Meires
 */
public class Metodos {

    public static int[] gerarVetorRandomico(int tamanho) {
        //preencher o array com numeros aleatorios de acordo com o tamanho informado
        int v[] = new int[tamanho];
        Random r = new Random();

        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (arrayList.size() < v.length) {
            int numeroRandomico = r.nextInt(v.length + 1);
            if (!arrayList.contains(numeroRandomico) && numeroRandomico != 0) {
                arrayList.add(numeroRandomico);
                v[count] = numeroRandomico;
                count++;
            }
        }
        return v;
    }

    public static void testarOrdenacao(int v[]) {
        boolean ordenado = true;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                ordenado = false;
            }
        }
        if (ordenado) {
            System.out.println("Vetor Ordenado");
        } else {
            System.out.println("Vetor Não Ordenado");
        }
    }

    public static void printVetor(int v[]) {
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    //Complexidade (n^2)
    public static int[] SelectionSort(int paramVetor[]) {

        int aux = 0, menor = 0; //1
        int v[] = paramVetor;//1
        for (int i = 0; i < v.length; i++) { //n-2
            menor = i; //1
            for (int j = i + 1; j < v.length; j++) {//n-2
                if (v[j] < v[menor]) {  //1
                    menor = j; //1
                }
            }
            aux = v[i];  //1
            v[i] = v[menor]; //1
            v[menor] = aux; //1
        }
        return v;
    }

    //Complexidade (n^2)
    public static int[] InsertionSort(int[] paramVetor) {
        int aux, j;
        int v[] = paramVetor;//1
        for (int i = 1; i < v.length; i++) {// n-2
            aux = v[i]; //1
            j = i - 1;//1
            while ((j >= 0) && v[j] > aux) { //n-2
                v[j + 1] = v[j]; //2
                j--; //1
            }
            v[j + 1] = aux; //2
        }
        return v;
    }

    //Complexidade (n^2)
    public static int[] BubbleSort(int[] paramVetor) {
        int v[] = paramVetor;//1
        int aux;
        for (int i = 0; i < v.length; i++) {//n-2
            for (int j = 0; j < v.length - 1; j++) {//n-2
                if (v[j] > v[j + 1]) {//1
                    aux = v[j];//1
                    v[j] = v[j + 1];//1
                    v[j + 1] = aux;//1
                }
            }
        }
        return v;
    }

    //Complexidade O(n log2 n)
    public static int[] ShellSort(int[] paramVetor) {
        int v[] = paramVetor;//1
        int i, j, val;
        int h = 1;//1
        do {
            h = 3 * h + 1;//2
        } while (h < v.length);//1

        do {
            h /= 3;//2
            for (i = h; i < v.length; i++) {//n-2
                val = v[i];//1
                j = i - h;//1
                while (j >= 0 && val < v[j]) {//n-2
                    v[j + h] = v[j];//2
                    j -= h;//1
                }
                v[j + h] = val;//2
            }
        } while (h > 1);//1
        return v;
    }

}
