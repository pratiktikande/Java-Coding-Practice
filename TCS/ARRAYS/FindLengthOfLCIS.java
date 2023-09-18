package TCS.ARRAYS;

public class FindLengthOfLCIS {
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int len=1,max=0;
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i-1]<nums[i])
                    len++;
                else
                {
                    max=Math.max(len,max);
                    len=1;
                }
            }
            return Math.max(max,len);
        }
    }
}
