package LeetCode;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        SingleNumber solution = new SingleNumber();
        int result = solution.singleNumber(nums);
        System.out.println("Single number is: " + result);
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande