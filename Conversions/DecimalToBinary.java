package Conversions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binary = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binary);
    }

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryBuilder = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryBuilder.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binaryBuilder.toString();
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande