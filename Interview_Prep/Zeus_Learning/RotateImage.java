package Interview_Prep.Zeus_Learning;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }

        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(rotated[i]));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Rotated Matrix:");
        rotate(matrix);
    }
}
