package JAVA;

import java.util.*;

public class min_max_array {

    public static int min_arr(int[] A, int N){
        int min = A[0];
        for(int i=0;i<N;i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        return min;
    }

    public static int max_arr(int[] A, int N){
        int max = A[0];
        for(int j=0;j<N;j++){
            if(A[j]>max){
                max = A[j];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6};
        int N = A.length;

        System.out.println("MINIMUM " + min_arr(A, N)  + "  MAXIMUM " + max_arr(A, N));
    }
}
