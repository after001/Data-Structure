public class MergeSort {

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (fim == inicio) {
            return;
        }
        int meio = (inicio + fim) / 2;
        mergeSort(vetor, inicio, meio);
        mergeSort(vetor, meio + 1, fim);
        merge(vetor, inicio, meio, fim);
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] left = new int[meio - inicio + 1];
        int[] right = new int[fim - meio];
        for (int i = 0; i < left.length; i++) {
            left[i] = vetor[inicio + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = vetor[meio + 1 + i];
        }
        int i = 0, j = 0, k = inicio;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                vetor[k] = left[i];
                i++;
            } else {
                vetor[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            vetor[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            vetor[k] = right[j];
            j++;
            k++;
        }
    }
}
