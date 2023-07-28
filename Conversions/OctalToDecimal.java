package Conversions;

import java.util.Scanner;

public class OctalToDecimal {
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int power = 0;

        // Iterate through the octal number from right to left
        for (int i = octal.length() - 1; i >= 0; i--) {
            char digitChar = octal.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            // Validate if the digit is a valid octal digit (0 to 7)
            if (digit < 0 || digit > 7) {
                System.out.println("Invalid input! The octal number contains an invalid digit.");
                return -1;
            }

            decimal += digit * Math.pow(8, power);
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalNumber = scanner.next();
        scanner.close();

        // Check if the input contains only valid octal digits (0 to 7)
        if (!octalNumber.matches("[0-7]+")) {
            System.out.println("Invalid input! Please enter a valid octal number (containing only digits 0 to 7).");
        } else {
            int decimalNumber = octalToDecimal(octalNumber);
            System.out.println("Decimal equivalent: " + decimalNumber);
        }
    }
}

