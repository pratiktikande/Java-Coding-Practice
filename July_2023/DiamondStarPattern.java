package July_2023;

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();
        scanner.close();
        
        // Check if the number of rows is odd
        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
            return;
        }
        
        int spaces = rows / 2;
        int stars = 1;
        
        // Print upper half of the diamond
        for (int i = 1; i <= (rows + 1) / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            spaces--;
            stars += 2;
        }
        
        spaces = 1;
        stars = rows - 2;
        
        // Print lower half of the diamond
        for (int i = 1; i <= rows / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande