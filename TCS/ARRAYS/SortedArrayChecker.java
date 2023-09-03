package TCS.ARRAYS;

public class SortedArrayChecker {
    // Iterative Approach
    public static boolean isSortedArray(int[] arr) {
        if (arr.length <= 1) {
            // An empty array is always Sorted
            return true;
        } 
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        // The array is sorted if the loop completes without finding unsorted elements.
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean sorted = isSortedArray(arr);
        System.out.println("Is the array sorted (Iterative)? " + sorted);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande