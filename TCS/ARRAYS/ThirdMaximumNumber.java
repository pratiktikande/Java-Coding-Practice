package TCS.ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        int distinctCount = 0;
        Integer prev = null;
        
        for (Integer num : arr) {
            if (!num.equals(prev)) {
                distinctCount++;
                if (distinctCount == 3) {
                    return num;
                }
            }
            prev = num;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        ThirdMaximumNumber solution = new ThirdMaximumNumber();
        int[] nums = { 3, 1, 2, 4 };
        int thirdMax = solution.thirdMax(nums);
        System.out.println("Third Maximum Number: " + thirdMax);
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande