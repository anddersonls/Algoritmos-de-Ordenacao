import java.util.Arrays;

public class CountingSort {
    public static int[] countingSort(int[]vecA){
        int maior = Arrays.stream(vecA).max().getAsInt();
        int[] vecB = new int[vecA.length];
        int[] vecC = new int[maior+1];

        for(int i=0; i<vecC.length; i++){
            vecC[i] = 0;
        }

        for(int j=0; j<vecC.length; j++){
            vecC[vecA[j]] = vecC[vecA[j]] + 1;
        }

        for(int j=1; j<vecC.length; j++){
            vecC[j] = vecC[j] + vecC[j-1];
        }

        for(int j=0; j<vecC.length; j++){
            vecC[j] = vecC[j]- 1;
        }

        for(int j=vecA.length-1; j > 0; j--){
            vecB[vecC[vecA[j]]] = vecA[j];
            if(vecC[vecA[j]] != 0) {
                vecC[vecA[j]] = vecC[vecA[j]] - 1;
            }
        }

        return vecB;
    }
}
