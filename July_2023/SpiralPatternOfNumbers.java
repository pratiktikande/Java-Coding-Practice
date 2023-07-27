package July_2023;

import java.util.Scanner;

public class SpiralPatternOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = sc.nextInt();
        sc.close();

        int[][] spiralArray = new int[size][size];
        printSpiralPattern(spiralArray);

        // Display the spiral pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", spiralArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void printSpiralPattern(int[][] array) {
        int top = 0, bottom = array.length - 1, left = 0, right = array[0].length - 1;
        int value = 1;

        while (value <= array.length * array[0].length) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                array[top][i] = value++;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                array[i][right] = value++;
            }
            right--;

            // Traverse from right to left
            for (int i = right; i >= left; i--) {
                array[bottom][i] = value++;
            }
            bottom--;

            // Traverse from bottom to top
            for (int i = bottom; i >= top; i--) {
                array[i][left] = value++;
            }
            left++;
        }
    }
}

