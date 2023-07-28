package Conversions;

import java.util.Scanner;

public class HexToDecimalConverter {

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;

        // Iterate over each character in the hexadecimal string from right to left
        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int digitValue = 0;

            // Convert hexadecimal digit to decimal value
            if (c >= '0' && c <= '9') {
                digitValue = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digitValue = 10 + (c - 'A');
            } else if (c >= 'a' && c <= 'f') {
                digitValue = 10 + (c - 'a');
            } else {
                // Invalid input, return -1 to indicate an error
                return -1;
            }

            // Multiply the decimal value of the digit with the appropriate power of 16
            decimalValue += digitValue * Math.pow(16, hex.length() - 1 - i);
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();
        scanner.close();

        int decimalValue = hexToDecimal(hex.toUpperCase());

        if (decimalValue != -1) {
            System.out.println("Decimal equivalent: " + decimalValue);
        } else {
            System.out.println("Invalid input. Please enter a valid hexadecimal number.");
        }
    }
}
