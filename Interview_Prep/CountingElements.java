package Interview_Prep;

public class CountingElements {

    public static int countElementsGreaterThan(int[] nums, int target) {
        int count = 0;

        for (int num : nums) {
            if (num > target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 5, 9, 4, 1, 8};
        int target = 5;

        int result = countElementsGreaterThan(nums, target);
        System.out.println("Number of elements greater than " + target + " is: " + result);
    }
}

