package July_2023;
import java.util.Scanner;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        printLeftTriangleStarPattern(n);
        scanner.close();
    }

    public static void printLeftTriangleStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
