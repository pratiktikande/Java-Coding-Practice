package Interview_Prep.Zeus_Learning;

//find second largest element from array without sorting array
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 25, 30, 15 };

        int secondLargest = findSecondLargest(arr);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second-largest element.");
        } else {
            System.out.println("The second-largest element is: " + secondLargest);
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}


