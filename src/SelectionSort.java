public class SelectionSort {
    public static int[] selectionSort(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            int min = i;
            for (int j = i + 1; j < vec.length; j++) {
                if (vec[j] < vec[min]) {
                    min = j;
                }
            }

            int aux = vec[i];
            vec[i] = vec[min];
            vec[min] = aux;
        }
        return vec;
    }

}
