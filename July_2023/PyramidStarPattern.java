package July_2023;

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = sc.nextInt();
        sc.close();
        printPyramidStarPattern(rows);
    }
    
    public static void printPyramidStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars to form a pyramid
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars for each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

