package TCS.Numbers;

import java.util.Scanner;

public class AddFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first fraction
        System.out.println("Enter the numerator of the first fraction:");
        int numerator1 = sc.nextInt();
        System.out.println("Enter the denominator of the first fraction:");
        int denominator1 = sc.nextInt();

        // Input for the second fraction
        System.out.println("Enter the numerator of the second fraction:");
        int numerator2 = sc.nextInt();
        System.out.println("Enter the denominator of the second fraction:");
        int denominator2 = sc.nextInt();

        // Calculate the least common multiple (LCM) of the denominators
        int lcm = findLCM(denominator1, denominator2);

        // Calculate the new numerators for both fractions
        int newNumerator1 = numerator1 * (lcm / denominator1);
        int newNumerator2 = numerator2 * (lcm / denominator2);

        // Add the numerators
        int sumNumerator = newNumerator1 + newNumerator2;

        // Simplify the result by finding the greatest common divisor (GCD)
        int gcd = findGCD(sumNumerator, lcm);

        // Simplify the fraction
        int simplifiedNumerator = sumNumerator / gcd;
        int simplifiedDenominator = lcm / gcd;

        // Display the result
        System.out.println("The sum of the fractions is: " + simplifiedNumerator + "/" + simplifiedDenominator);

        sc.close();
    }

    // Method to find the least common multiple (LCM) of two numbers
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Method to find the greatest common divisor (GCD) of two numbers using Euclidean algorithm
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande