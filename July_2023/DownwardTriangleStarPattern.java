package July_2023;

import java.util.Scanner;

public class DownwardTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = rows; i >= 1; i--) {
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande