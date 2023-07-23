package July_2023;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        // Write a Java program to input and display your password.
        System.out.println("Enter Your Password");
        Scanner sc = new Scanner(System.in);
        String Password =sc.nextLine();

        System.out.println("Your Password is "+ Password);
        sc.close();
    }
}
