package TCS.ARRAYS;

import java.util.*;

public class SortElementsByFrequency {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 2, 8, 5, 6, 8, 8};
        int[] arr2 = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};

        // Sort both arrays by frequency
        sortArrayByFrequency(arr1);
        sortArrayByFrequency(arr2);

        // Print the sorted arrays
        System.out.println("Sorted arr1: " + Arrays.toString(arr1));
        System.out.println("Sorted arr2: " + Arrays.toString(arr2));
    }

    public static void sortArrayByFrequency(int[] arr) {
        // Step 1: Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Sort the elements using the custom Comparator
        Arrays.sort(arr);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande
