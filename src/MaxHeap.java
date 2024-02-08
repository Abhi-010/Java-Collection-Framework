import java.util.Arrays;

public class MaxHeap {
    public static void main(String[] args) {
        int [] A = {3,6,5,0,8,2,1,9};
        int N = A.length;
        int lastInternalIndex = N/2 - 1;

        for(int i = lastInternalIndex ; i >= 0 ; i--){
            maxHeapify(A,i);
        }

        for(int i = 0 ; i < N ; i++){
            System.out.println("element " + i + " " + A[i]);
        }
    }

    public static void maxHeapify(int[] A, int i){
        int l = 2*i+1;
        int r = 2*i+2;

        int largest = i;

        if(l < A.length && A[l] > A[i]){
            largest = l ;
        }
        if(r < A.length && A[r] > A[largest]){
            largest = r;
        }
        if(largest != i){
            //swap
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A,largest);
        }

    }
}
