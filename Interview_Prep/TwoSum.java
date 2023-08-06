package Interview_Prep;

//Two Sum: Given an array of integers and a target value, find two numbers that add up to the target
public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no such pair exists, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
            System.out.println("The two numbers are: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}

