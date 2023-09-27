public class MergeSort {
    public static int[] mergeSort(int [] vec){
        int [] tempVec = new int[vec.length];

        return mergeMain(vec, tempVec, 0, vec.length-1);
    }

    public static int [] mergeMain(int [] vec, int [] tempVec, int esq, int dir){
        int meio;
        if(esq<dir){
            meio = (esq+dir) / 2;
            mergeMain(vec, tempVec, esq, meio);
            mergeMain(vec, tempVec, meio + 1, dir);
            merge(vec, tempVec, esq, meio+1, dir);
        }

        return vec;
    }

    public static void merge (int [] vec, int [] tempVec, int esqPos, int dirPos, int dirFim){
        int esqFim = dirPos - 1;
        int tempPos = esqPos;
        int numElem = dirFim - esqPos + 1;

        while(esqPos <= esqFim && dirPos <= dirFim){
            if(vec[esqPos] <= vec[dirPos]){
                tempVec[tempPos] = vec[esqPos];
                esqPos++;
            }else{
                tempVec[tempPos] = vec[dirPos];
                dirPos++;
            }
            tempPos++;
        }

        while(esqPos <= esqFim){
            tempVec[tempPos] = vec[esqPos];
            tempPos++;
            esqPos++;
        }

        while(dirPos <= dirFim){
            tempVec[tempPos] = vec[dirPos];
            tempPos++;
            dirPos++;
        }

        for(int i=0; i<numElem; i++, dirFim--){
            vec[dirFim] = tempVec[dirFim];
        }
    }
}
