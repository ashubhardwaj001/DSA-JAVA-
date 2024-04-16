package JAVA;

import java.util.Arrays;

public class ChocolateDistribution {
    
    public static int minDiffChocolates(int[] nums, int m) {
        Arrays.sort(nums);  // Sort the array
        
        int minDiff = Integer.MAX_VALUE;  // Initialize minDiff to max value
        
        // Iterate through the first m elements in the sorted array
        for (int i = 0; i <= nums.length - m; i++) {
            int diff = nums[i + m - 1] - nums[i];
            
            // Update minDiff if the difference is smaller
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        return minDiff;
    }

    public static void main(String[] args) {
        int[] nums = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println("Minimum difference: " + minDiffChocolates(nums, m));  // Output: Minimum difference: 2
    }
}
