package July_2023;

import java.util.Scanner;

public class MultiplyFloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        float result = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande