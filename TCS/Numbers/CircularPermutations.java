package TCS.Numbers;

import java.util.Scanner;

public class CircularPermutations {
    // Function to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void Calculate(int num) {
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Calculate circular permutations
        int circularPermutations = factorial(num - 1);
        System.out.println("Number of Circular Permutations for " + num + " persons: " + circularPermutations);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of persons (N): ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Calculate(num);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande