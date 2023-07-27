package July_2023;

import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = sc.nextInt();
        sc.close();
        
        printSquareStarPattern(size);
    }
    
    public static void printSquareStarPattern(int size) {
        // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Inner loop for columns
            for (int j = 0; j < size; j++) {
                // Check if the current cell is on the border of the square
                // If it is, print a star
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    // If not on the border, print a space
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}


