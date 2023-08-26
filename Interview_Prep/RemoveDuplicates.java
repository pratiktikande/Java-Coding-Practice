package Interview_Prep;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5}; // Example input
        int newLength = removeDuplicates(nums);
        System.out.println("Modified array length: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums, 0, newLength)));
    }
}
