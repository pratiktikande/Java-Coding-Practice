package November;

import java.util.Arrays;

public class LargeSmallSum {
    public static int largeSmallSum(int[] arr) {
        if (arr.length < 4) {
            return 0;
        }

        Arrays.sort(arr);
        return arr[arr.length - 2] + arr[1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7, 5, 4};
        int largeSmallSum = largeSmallSum(arr);
        System.out.println("Large small sum: " + largeSmallSum);
    }
}
