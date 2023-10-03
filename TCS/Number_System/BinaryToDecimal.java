package TCS.Number_System;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input binary string
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        // Check if the input is a valid binary string
        if (!isValidBinary(binaryString)) {
            System.out.println("Invalid binary input.");
            scanner.close();
            return;
        }
        
        // Convert binary to decimal
        int decimal = binaryToDecimal(binaryString);
        
        // Output the result
        System.out.println("Decimal equivalent: " + decimal);
        
        scanner.close();
    }
    
    // Function to check if a string is a valid binary number
    public static boolean isValidBinary(String binaryString) {
        // Regular expression to match a valid binary number
        String binaryPattern = "^[01]+$";
        return binaryString.matches(binaryPattern);
    }
    
    // Function to convert binary to decimal
    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int length = binaryString.length();
        
        for (int i = 0; i < length; i++) {
            // Convert each character to an integer (0 or 1)
            int digit = Character.getNumericValue(binaryString.charAt(i));
            
            // Calculate the decimal equivalent using the position of the digit
            decimal += digit * Math.pow(2, length - 1 - i);
        }
        
        return decimal;
    }
}
