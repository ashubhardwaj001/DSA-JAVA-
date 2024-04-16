package JAVA;
import java.util.*;

public class max_subarray {
    public static int[] max_array(int[] num){
        int max_sum = num[0];
        int curr_sum = num[0];
        int tempstart = 0;
        int start = 0;
        int end = 0;

        for(int i=1;i<num.length;i++){
            if(num[i]>curr_sum+num[i]){
                curr_sum = num[i];
                tempstart = i;
            }
            else{
                curr_sum += num[i];
            }

            if(curr_sum>max_sum){
                max_sum = curr_sum;
                start = tempstart;
                end = i;
            }
        }
        return Arrays.copyOfRange(num, start, end + 1);
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,3,5,6,-2,-6,-4,6};
        int[] maxSubArray = max_array(num);
        int maxSum = 0;

        for (int i : maxSubArray){
            maxSum += i;
        }
        System.out.println("Maximum Subarray: " + Arrays.toString(maxSubArray));
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
