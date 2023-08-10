package DSA.Algorithms;

public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            mergeSort(arr, si, mid);       // Sort left half
            mergeSort(arr, mid + 1, ei);   // Sort right half
            merge(arr, si, mid, ei);       // Merge the two halves
        }
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;  // Iterator for left
        int j = mid + 1;  // Iterator for right
        int k = 0;  // Iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left and right subarrays
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp array back to original array
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
