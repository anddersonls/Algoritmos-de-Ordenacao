public class HeapSort {
    public static void Maxheap(int []vetor, int i, int n){
        int esquerda=2*i+1;
        int direita= 2*i+2;
        int raiz=i;
        if(esquerda<n&&vetor[esquerda]>vetor[raiz]){
            raiz=esquerda;
        }
        if(direita<n&&vetor[direita]>vetor[raiz]){
            raiz=direita;
        }
        if(raiz!=i){
            int aux=vetor[raiz];
            vetor[raiz]=vetor[i];
            vetor[i]=aux;
            Maxheap(vetor, raiz, n);
        }

    }
    //faz um vetor ficar no formato de heap
    public static void ConstroiHeap(int []vetor){
        int n=vetor.length;
        for(int i=n/2 -1;i>=0;i--){
            Maxheap(vetor, i,n);
        }
    }
    public static void heapSort(int []vetor){
        int n=vetor.length;
        for(int j=n-1;j>=0;j--){
            int aux=vetor[0];
            vetor[0]=vetor[j];
            vetor[j]=aux;
            Maxheap(vetor,0, j);
        }
    }
}
