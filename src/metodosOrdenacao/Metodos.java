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
        int i, j, aux;
        int h = 1;//1
        do {
            h = 3 * h + 1;//2
        } while (h < v.length);//1

        do {
            h /= 3;//2
            for (i = h; i < v.length; i++) {//n-2
                aux = v[i];//1
                j = i - h;//1
                while (j >= 0 && aux < v[j]) {//n-2
                    v[j + h] = v[j];//2
                    j -= h;//1
                }
                v[j + h] = aux;//2
            }
        } while (h > 1);//1
        return v;
    }

    public static int[] MergeSort(int[] vetor) {

        if (vetor.length <= 1) {
            return vetor;
        }

        int meio = vetor.length / 2;
        int[] dir = vetor.length % 2 == 0 ? new int[meio] : new int[meio + 1];
        int[] esq = new int[meio];

        int[] vetorAux = new int[vetor.length];

        for (int i = 0; i < meio; i++) {
            esq[i] = vetor[i];
        }

        int auxIndex = 0;
        for (int i = meio; i < vetor.length; i++) {
            dir[auxIndex] = vetor[i];
            auxIndex++;
        }

        esq = MergeSort(esq);
        dir = MergeSort(dir);

        vetorAux = MergeVetor(esq, dir);

        return vetorAux;
    }

    static int[] MergeVetor(int[] esq, int[] dir) {
        int[] aux = new int[esq.length + dir.length];

        int iDir = 0, iEsq = 0, iAux = 0;

        while (iEsq < esq.length || iDir < dir.length) {
            if (iEsq < esq.length && iDir < dir.length) {
                if (esq[iEsq] <= dir[iDir]) {
                    aux[iAux] = esq[iEsq];
                    iAux++;
                    iEsq++;
                } else {
                    aux[iAux] = dir[iDir];
                    iAux++;
                    iDir++;
                }
            } else if (iEsq < esq.length) {
                aux[iAux] = esq[iEsq];
                iAux++;
                iEsq++;
            } else if (iDir < dir.length) {
                aux[iAux] = dir[iDir];
                iAux++;
                iDir++;
            }
        }
        return aux;
    }

    public static void HeapSort(int[] vetor) {
        construirMaxHeap(vetor);
        int n = vetor.length;                          // n
        for (int i = vetor.length - 1; i > 0; i--) {   // n ^2 
            swap(vetor, i, 0);
            maxHeap(vetor, 0, --n);
        }

    }

    private static void construirMaxHeap(int[] vetor) {
        for (int i = vetor.length / 2 - 1; i >= 0; i--) // n^2 
        {
            maxHeap(vetor, i, vetor.length);
        }

    }

    private static void maxHeap(int[] vetor, int pos, int tamanhoDoVetor) {

        int max = 2 * pos + 1, right = max + 1;        // n
        if (max < tamanhoDoVetor) {

            if (right < tamanhoDoVetor && vetor[max] < vetor[right]) //n
            {
                max = right;
            }

            if (vetor[max] > vetor[pos]) //n 
            {
                swap(vetor, max, pos);
                maxHeap(vetor, max, tamanhoDoVetor);
            }
        }
    }

    public static void swap(int v[], int x, int y) {
        int temp = v[x];    //n
        v[x] = v[y];        //n
        v[y] = temp;        //n
    }

    public static void QuickSort(int[] vetor, int inicio, int fim) {

        int middle = inicio + (fim - inicio) / 2;   //n
        int pivot = vetor[middle];   //n

        int i = inicio, j = fim;   //n
        while (i <= j) {

            while (vetor[i] < pivot) {
                i++;
            }

            while (vetor[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(vetor, i, j);
                i++;
                j--;
            }
        }

        if (inicio < j) {
            QuickSort(vetor, inicio, j);
        }
        if (fim > i) {
            QuickSort(vetor, i, fim);
        }
    }

    public static void RadixSort(int[] v) {

        for (int shift = Integer.SIZE - 1; shift > -1; shift--) {

            int[] aux = new int[v.length];

            int j = 0;

            for (int i = 0; i < v.length; i++) {

                boolean move = v[i] << shift >= 0;

                if (shift == 0 ? !move : move) {
                    aux[j] = v[i];
                    j++;
                } else {
                    v[i - j] = v[i];
                }
            }

            for (int i = j; i < aux.length; i++) {
                aux[i] = v[i - j];
            }

            v = aux;
        }
    }

}
