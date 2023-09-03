package LeetCode;

import java.util.Arrays;

public class MaximumProductOfThreeNumber {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Calculate the two possible maximum product scenarios
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];
        
        // Return the maximum of the two options
        return Math.max(option1, option2);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande