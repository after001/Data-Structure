public class MergeSort {

    public static void merge(int[] v, int left, int middle, int right) {
        
        // transfere os elementos entre left e right para um array auxiliar.
        int[] helper = new int[v.length];
        for (int i = left; i <= right; i++) {
            helper[i] = v[i];
        }
        
        int i = left;
        int j = middle + 1;
        int k = left;
        
        while (i <= middle && j <= right) {
            
            if (helper[i] <= helper[j]) {
                v[k] = helper[i];
                i++;
            } else {
                v[k] = helper[j];
                j++;
            }
            k++;    
            
        }
        
        // se a metade inicial não foi toda consumida, faz o append.
        while (i <= middle) {
            v[k] = helper[i];
            i++;
            k++;
        }
        
        // se a metade final não foi toda consumida, faz o append.
        while (j <= right) {
            v[k] = helper[j];
            j++;
            k++;
        }

    }
}
