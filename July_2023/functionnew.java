package July_2023;

import java.util.Scanner;

public class Functionnew {
    public static void sum(int a, int b) {
        System.out.println(a + b);

    }

    public static void product(int a, int b) {
        System.out.println(a * b);

    }

    public static void divide(int a, int b) {
        System.out.println(a / b);

    }

    public static void minus(int a, int b) {
        System.out.println(a - b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number For +,-,*,/ ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        sum(a, b);
        product(a, b);
        minus(a, b);
        divide(a, b);

    }
}
