package November;

public class NumberOfballs {
    /*
     * Problem Statement - Write a function which accepts positive integers array of
     * size 'n'. Every k'th element in the array is the number of balls in k'th row
     * of a box. Every k'th row of a box needs (k+1)^2 balls, where k lies between 0
     * and (n-1) inclusive. The function should return the number of balls required
     * to complete each row of the box.
     */
    

    public static int numberOfBalls(int[] arr) {
        if (arr.length <= 0) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            result += (int) (Math.pow(i + 1, 2) - arr[i]);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 13 };
        System.out.println(numberOfBalls(arr));
    }
}