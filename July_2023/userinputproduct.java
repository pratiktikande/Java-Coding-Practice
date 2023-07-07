package July_2023;

import java.util.Scanner;

public class userinputproduct {
    public static void main(String[] args) {
        //Write a Java program that takes two numbers as input and displays the product of two numbers

         System.out.println(" Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        Scanner sc1 = new Scanner(System.in);
        int b= sc.nextInt();
        
        System.out.println("product of" + a + " 7& "+b + "  is  " + (a*b) );
        sc.close();
        sc1.close();



    }
}
