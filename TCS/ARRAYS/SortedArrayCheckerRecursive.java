package TCS.ARRAYS;

public class SortedArrayCheckerRecursive {
    //Recursive Approach
    public static boolean sortedArrayCheckerRecursive(int[] arr, int index) {
        if (index <= 0) {
            return true;
        }

        if (arr[index] < arr[index - 1]) {
            return false;
        }
        // Recursion
        return sortedArrayCheckerRecursive(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int index = arr.length - 1;
        boolean sorted = sortedArrayCheckerRecursive(arr, index);
        System.out.println("Is the array sorted (Recursive)? " + sorted);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande