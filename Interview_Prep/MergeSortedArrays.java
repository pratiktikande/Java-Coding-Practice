package Interview_Prep;

import java.util.Arrays;

//Merge Two Sorted Arrays: Given two sorted arrays, merge them into a single sorted array

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];

        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        int k = 0; // Pointer for mergedArray

        // Compare elements from both arrays and place them in the merged array in ascending order
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        // Copy any remaining elements from nums1, if any
        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }

        // Copy any remaining elements from nums2, if any
        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeArrays(nums1, nums2);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
