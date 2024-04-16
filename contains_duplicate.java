package JAVA;
import java.util.HashSet;

public class contains_duplicate {
    
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // Found a duplicate
            }
            
            set.add(num);  // Add the element to the set
        }
        
        return false;  // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Array contains duplicate: " + containsDuplicate(nums1));  // Output: true
        
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Array contains duplicate: " + containsDuplicate(nums2));  // Output: false
    }
}
