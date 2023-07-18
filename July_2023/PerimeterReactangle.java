package July_2023;

import java.util.Scanner;

public class PerimeterReactangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = calculatePerimeter(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        scanner.close();
    }

    public static double calculatePerimeter(double length, double width) {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
