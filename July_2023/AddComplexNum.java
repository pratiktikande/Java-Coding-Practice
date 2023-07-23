package July_2023;

import java.util.Scanner;

public class AddComplexNum {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        scanner.close();

        double realSum = real1 + real2;
        double imaginarySum = imaginary1 + imaginary2;

        System.out.println("Sum of the complex numbers: " + realSum + " + " + imaginarySum + "i");
    }
}
