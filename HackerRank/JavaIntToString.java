package HackerRank;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            //String s=???; Complete this line below
            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        }
    }
//www.github.com/pratiktikande
//@Pratik Tikande