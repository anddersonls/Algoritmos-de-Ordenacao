public class ShellSort {
    public static int[] shellSort(int[] vec) {
        int h, temp, j;
        for (h = 1; h < vec.length; h = (3 * h) + 1);
        while (h > 0) {
            h = (h - 1) / 3;

            for (int i = h; i < vec.length; i++) {
                temp = vec[i];
                j = i;

                while (vec[j - h] > temp) {

                    vec[j] = vec[j - h];
                    j = j - h;
                    if (j < h) {
                        break;
                    }
                }
                vec[j] = temp;

            }
        }
        return vec;
    }

}
