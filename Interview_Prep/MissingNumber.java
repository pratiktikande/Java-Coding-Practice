package Interview_Prep;

//Find Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array
public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int missingNumber = n;

        for (int i = 0; i < n; i++) {
            missingNumber ^= i ^ nums[i];
        }

        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1};
        int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Missing number in arr1: " + findMissingNumber(arr1));
        System.out.println("Missing number in arr2: " + findMissingNumber(arr2));
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande