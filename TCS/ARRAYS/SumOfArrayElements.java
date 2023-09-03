package TCS.ARRAYS;

public class SumOfArrayElements {
    public static int sumOfArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 9};
        int result = sumOfArray(nums);
        System.out.println("Sum of array elements: " + result);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande