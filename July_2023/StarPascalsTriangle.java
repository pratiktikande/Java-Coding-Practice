package July_2023;

import java.util.Scanner;

public class StarPascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numRows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("  ");
            }

            // Print left half of the triangle using stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Print right half of the triangle using stars
            for (int j = i - 1; j >= 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande