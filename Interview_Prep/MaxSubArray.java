package Interview_Prep;

//Maximum Subarray Sum: Find the contiguous subarray with the largest sum in an array of integers

public class MaxSubArray {

    public static int maxSubarraySum(int[] nums) {
        int maxSum = nums[0]; // Initialize maxSum with the first element of the array
        int currentSum = nums[0]; // Initialize currentSum with the first element of the array

        for (int i = 1; i < nums.length; i++) {
            // Compare the current element with the sum of the current element and the previous subarray sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum if the currentSum is greater than the current maxSum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1, 2, 3, -2, 5};

        System.out.println("Maximum subarray sum in nums1: " + maxSubarraySum(nums1));
        System.out.println("Maximum subarray sum in nums2: " + maxSubarraySum(nums2));
    }
}

