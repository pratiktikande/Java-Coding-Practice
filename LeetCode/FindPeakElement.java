package LeetCode;

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length== 1)
            return 0;
        int max= Integer.MIN_VALUE;
        int index= Integer.MIN_VALUE;
        for(int i= 0; i< nums.length; i++){
            if(max< nums[i]){
                max= nums[i];
                index= i;
            }
        }

        return index;
    }
}