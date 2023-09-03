package DSA.Algorithms;

public class RotatedSortedArray {

    // Modified Binary search
    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        // To find mid
        int mid = (si + ei) / 2;

        // Compare With Mid
        if (target == arr[mid]) {
            return mid;
        }

        // First condition found on line one
        if (arr[si] <= arr[mid]) {
            // Search In Left Direction
            if (arr[si] <= target && target <= arr[mid]) {
                // Recursion call
                return search(arr, target, si, mid - 1);
            } else {
                // Search on Right side
                return search(arr, target, mid + 1, ei);
            }
        } else {
            // Search On right side
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // Search on left side
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output should be index 4 of arr
        int targetIndex = search(arr, target, 0, arr.length - 1);
        System.out.println(targetIndex);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande