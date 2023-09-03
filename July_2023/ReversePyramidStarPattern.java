package July_2023;
import java.util.Scanner;

public class ReversePyramidStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of number: ");
        int number = scanner.nextInt();
        
        printReversePyramidStarPattern(number);
        scanner.close();
    }

    public static void printReversePyramidStarPattern(int number) {
        for (int i = 1; i <= number; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * (number - i) + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande