import java.util.Arrays;

public class MaxHeap {
    public static void main(String[] args) {
        int [] A = {3,6,5,0,8,2,1,9};
        int N = A.length;
        int lastInternalIndex = N/2 - 1;
        //build Max Heap from an input array.
        for(int i = lastInternalIndex ; i >= 0 ; i--){
            maxHeapify(A,i,A.length);
        }
        System.out.println("Array after maxHeapify");
        for(int i = 0 ; i < N ; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        sortHeap(A);
        System.out.println("Heap Sort in Decreasing Order : ");
        for(int i = 0 ; i < N ; i++){
            System.out.print(A[i] + " ");
        }
    }
    public static void sortHeap(int [] A){
        int p1 = 0;
        int p2 = A.length-1;
        int heapSize = A.length;
        while(p1 < p2){
            //swap
            swap(A,p1,p2);
            heapSize--;
            p2--;
            maxHeapify(A,p1,heapSize);
        }
    }

    static void swap(int[] A, int p1,int p2){
        int temp = A[p1];
        A[p1] = A[p2];
        A[p2] = temp;
    }

    public static void maxHeapify(int[] A, int i, int heapSize){
        int length = A.length;
        if(heapSize != A.length){
            length = heapSize;
        }
        int l = 2*i+1;
        int r = 2*i+2;

        int largest = i;

        if(l < length && A[l] > A[i]){
            largest = l ;
        }
        if(r < length && A[r] > A[largest]){
            largest = r;
        }
        if(largest != i){
            //swap
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A,largest,heapSize);
        }

    }
}
