package TCS.Numbers;

import java.util.Scanner;

class SumOfNaturalNumbers {

    public static void Calculate(int Num) {
        int sum = 0;
        for (int i = 1; i <= Num; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + Num + " natural numbers is: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        sc.close();
        if (Num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            Calculate(Num);
        }
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande