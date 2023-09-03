package Conversions;

import java.util.Scanner;

public class DecimalToOctal {
    public static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder octal = new StringBuilder();

        // Perform repeated division by 8 to obtain the octal digits
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder); // Insert the remainder at the beginning of the octal string
            decimal /= 8;
        }

        return octal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String octalNumber = decimalToOctal(decimalNumber);
        System.out.println("Octal equivalent: " + octalNumber);
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande