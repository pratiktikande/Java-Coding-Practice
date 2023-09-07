package LeetCode;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        int flag = 0;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                flag = flag + 1; // for checking how many times max or second max value repeating
            } else {
                count = count + 1; // for getting distinct max value count (until 3rd max value)
            }
            if (count == 3) {
                return nums[n - count - flag]; // n=total value , count = 3, flag = how many times max or second max
                                               // repeating
            }
        }
        return nums[n - 1];
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande