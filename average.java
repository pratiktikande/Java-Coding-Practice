import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        //Write a Java program that takes three numbers as input to calculate and print the average of the numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers ");
        int a=sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The Average of Three Numbers Is " + (a+b+c/3));
        sc.close();

    }
}
