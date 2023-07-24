package July_2023;

import java.util.Scanner;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int r = scanner.nextInt();
        
        printPyramidNumberPattern(r);
        scanner.close();
    }

    public static void printPyramidNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int k = i; k <= 2 * i - 1; k++) {
                System.out.print(k + " ");
            }

            // Print decreasing numbers
            for (int l = 2 * i - 2; l >= i; l--) {
                System.out.print(l + " ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
