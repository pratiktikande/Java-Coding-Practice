package TCS.ARRAYS;

public class RightRotateArray {
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than the array length
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int k1 = 2;
        rightRotate(arr1, k1);
        System.out.print("Output for arr1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

