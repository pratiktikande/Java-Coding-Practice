package July_2023;
import java.util.Scanner;
public class MultiplyTable {
    public static void main(String[] args) {
        // Write a Java program that takes a number as input and prints its
        // multiplication table up to 10
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + a * i);
            sc.close();
        }
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande