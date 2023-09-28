package Interview_Prep.Zeus_Learning;

public class SecondLargestElementComplexityOn {
    public static int findSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; 
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
            return -1; 
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 1, 7, 12, 5, 9 };
        int result = findSecondLargest(arr);
        if (result != -1) {
            System.out.println("The second largest element is: " + result);
        }
    }
}
