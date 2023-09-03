package July_2023;

import java.util.Scanner;

public class GcdHcf {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Function to find the GCD of two numbers
    public static int findGCD(int a, int b) {
        int gcd = 1;
        int smallerNumber = Math.min(a, b);

        for (int i = 2; i <= smallerNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande