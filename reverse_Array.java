package JAVA;
import java.util.*;

public class reverse_Array {

    public static void reverse(int[] A, int N){
        int[] B = new int[N];

        for(int i=0;i<N;i++){
            B[i] = A[N - i -1]; 
        }

        System.out.print("Reversed Array: ");
        for (int i : B) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int N = A.length;

        reverse(A, N);
    }
}
