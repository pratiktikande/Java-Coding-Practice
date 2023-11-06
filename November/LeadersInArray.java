package November;

public class LeadersInArray {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        System.out.print("Leaders in the array: " + arr[n - 1] + " "); // The rightmost element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[i + 1]) { // Check if the current element is greater than or equal to the next one
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }
}
