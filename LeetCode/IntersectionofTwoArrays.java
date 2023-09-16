package LeetCode;

import java.util.Arrays;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        int i = 0;
        int j = 0;
        
     while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (index == 0 || result[index - 1] != nums1[i]) {
                    result[index] = nums1[i];
                    index++;
                }
                i++;
                j++;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionofTwoArrays solution = new IntersectionofTwoArrays();
        int[] result = solution.intersection(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
