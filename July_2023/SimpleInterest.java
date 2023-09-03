package July_2023;

import java.util.Scanner;

class SimpleInterest {

   public static void CalculateInt(float P, float T , float R) {
        // Simple Interest = (P x T x R)/100
        /*
         * P is the principal amount
         * T is the time and
         * R is the rate
         */


        // Calculate simple interest
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }

    public static void main(String[] args) {
          // We can change values here for
        // different inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principle Amount");
        float P = sc.nextFloat();
        System.out.println("Enter The Time");

        float R = sc.nextFloat();
        System.out.println("Enter The Rate");

        float T = sc.nextFloat();
        sc.close();
        CalculateInt(P,R,T);
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande