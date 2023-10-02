package TCS.Others;

public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the key is at the middle element
            if (arr[mid] == key) {
                return mid;
            }

            // If the key is smaller, it must be in the left half
            if (arr[mid] > key) {
                right = mid - 1;
            }

            // If the key is larger, it must be in the right half
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 11, 13, 15 };
        int result = binarySearch(arr,7);

        if (result != -1) {
            System.out.println("Key found at index " + result);
        } else {
            System.out.println("Key not found in the array");
        }
    }
}
