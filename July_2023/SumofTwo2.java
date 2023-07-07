package July_2023;

import java.util.Scanner;

public class SumofTwo2 {
    public static void main(String[] args) {
        // with user input 
        System.out.println(" Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        Scanner sc1 = new Scanner(System.in);
        int b= sc.nextInt();
        
        System.out.println("sum of" + a + "& "+b + "  is  " + (a+b) );
        sc.close();
        sc1.close();

    }
}
