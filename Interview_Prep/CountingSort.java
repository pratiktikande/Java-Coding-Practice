package Interview_Prep;

import java.util.Arrays;

//Counting Sort: Implement counting sort to sort an array of integers in java
public class CountingSort {

    public static void countingSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to sort an array with 0 or 1 element
        }

        int maxElement = arr[0];
        int minElement = arr[0];

        // Find the maximum and minimum elements in the array
        for (int num : arr) {
            maxElement = Math.max(maxElement, num);
            minElement = Math.min(minElement, num);
        }

        int range = maxElement - minElement + 1;
        int[] countArray = new int[range];

        // Count the occurrences of each element
        for (int num : arr) {
            countArray[num - minElement]++;
        }

        // Modify the countArray to store the cumulative counts
        for (int i = 1; i < range; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] sortedArray = new int[arr.length];

        // Build the sorted array
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedArray[--countArray[arr[i] - minElement]] = arr[i];
        }

        // Copy the sorted array back to the original array
        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

