package November;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String s1) {
        int len = s1.length();
        StringBuilder reversed = new StringBuilder(len);

        for (int i = len - 1; i >= 0; i--) {
            reversed.append(s1.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        sc.close();
        String reversedString = reverseString(s1);
        System.out.println("Reversed string: " + reversedString);
    }
}
