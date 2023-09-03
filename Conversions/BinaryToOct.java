package Conversions;

import java.util.Scanner;

public class BinaryToOct {
    public static String binaryToOctal(String binary) {
        // Pad the binary number to have a length divisible by 3
        int paddingLength = (binary.length() + 2) / 3 * 3;
        binary = String.format("%" + paddingLength + "s", binary).replace(' ', '0');

        StringBuilder octal = new StringBuilder();

        // Iterate through the binary number in chunks of 3 digits and convert to octal
        for (int i = 0; i < binary.length(); i += 3) {
            String chunk = binary.substring(i, i + 3);
            int decimal = Integer.parseInt(chunk, 2);
            octal.append(Integer.toOctalString(decimal));
        }

        return octal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.next();
        scanner.close();

        // Check if the input contains only 0s and 1s
        if (!binaryNumber.matches("[01]+")) {
            System.out.println("Invalid input! Please enter a binary number (containing only 0s and 1s).");
        } else {
            String octalNumber = binaryToOctal(binaryNumber);
            System.out.println("Octal equivalent: " + octalNumber);
        }
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande