package TCS.Numbers;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the coefficients of the quadratic equation
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Find the roots of the quadratic equation
        double root1, root2;
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
        } else {
            root1 = root2 = Double.NaN;
        }

        // Print the roots of the quadratic equation
        if (discriminant > 0) {
            System.out.println("The roots of the equation are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            System.out.println("The root of the equation is " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }
        scanner.close();
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande