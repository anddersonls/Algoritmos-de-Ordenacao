import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CountingSort cs = new CountingSort();
        Random random = new Random();

        int[]v = new int[1000000];
        int[] result;

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(1000000);
        }

        result = cs.countingSort(v);

        for(int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}