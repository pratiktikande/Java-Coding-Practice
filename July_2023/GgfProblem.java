package July_2023;

class Solution {
    public int findMissingNumber(int[] arr) {
        int n = arr.length;

        // Step 1: Separate positive and non-positive numbers
        int shift = segregate(arr, n);

        // Step 2: Mark presence of positive numbers
        markPresence(arr, n, shift);

        // Step 3: Find the smallest missing positive number
        return findMissing(arr, n, shift);
    }

    // Separate positive and non-positive numbers
    private int segregate(int[] arr, int n) {
        int shift = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                // Swap non-positive number to the left side
                swap(arr, i, shift);
                shift++;
            }
        }
        return shift;
    }

    // Mark presence of positive numbers
    private void markPresence(int[] arr, int n, int shift) {
        for (int i = shift; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num - 1 + shift < n && arr[num - 1 + shift] > 0) {
                arr[num - 1 + shift] = -arr[num - 1 + shift];
            }
        }
    }

    // Find the smallest missing positive number
    private int findMissing(int[] arr, int n, int shift) {
        for (int i = shift; i < n; i++) {
            if (arr[i] > 0) {
                return i - shift + 1;
            }
        }
        return n - shift + 1;
    }

    // Swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class GgfProblem {
    public static void main(String[] args) {
        int[] arr = { -5, -3, -2, 0, 1, 2, 3, 5 };
        Solution solution = new Solution();
        int missingNumber = solution.findMissingNumber(arr);
        System.out.println("Smallest positive missing number: " + missingNumber);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande