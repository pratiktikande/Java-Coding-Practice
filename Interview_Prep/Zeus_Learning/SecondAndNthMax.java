package Interview_Prep.Zeus_Learning;

public class SecondAndNthMax {
    public static int findSecondMax(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; // Return a suitable value or throw an exception as per your requirement
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found");
            return -1; // Return a suitable value or throw an exception as per your requirement
        } else {
            return secondMax;
        }
    }

    public static int findNthMax(int[] arr, int n) {
        if (arr.length < n) {
            System.out.println("Array does not have " + n + " elements");
            return -1; // Return a suitable value or throw an exception as per your requirement
        }

        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }

            // Remove the current max element from the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == max) {
                    arr[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        int nthMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > nthMax) {
                nthMax = num;
            }
        }

        return nthMax;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 7, 5};
        int secondMax = findSecondMax(arr);
        System.out.println("Second maximum element: " + secondMax);

        int nthMax = findNthMax(arr, 3); // To find the 3rd maximum element
        System.out.println("3rd maximum element: " + nthMax);
    }
}
