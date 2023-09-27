public class InsertionSort {
    public static int[] insertionSort(int[] vec) {
        for (int i = 1; i < vec.length; i++) {
            int j = i - 1, chave = vec[i];

            while (j >= 0 && vec[j] > chave) {
                vec[j + 1] = vec[j];
                j--;
            }

            vec[j + 1] = chave;
        }
        return vec;
    }

}
