package July_2023;

import java.util.Scanner;

public class ReadPrintInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer value
        System.out.print("Enter an integer value: ");

        // Read the integer input provided by the user
        int intValue = scanner.nextInt();

        // Print the integer value
        System.out.println("You entered: " + intValue);

        // Close the scanner to release resources (not necessary in this simple example, but good practice)
        scanner.close();
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande
