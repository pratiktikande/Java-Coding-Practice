package July_2023;

import java.util.Scanner;

public class NeonNumberCheck {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isNeonNumber(number)) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }
    }
    
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        
        return sum == number;
    }
}

