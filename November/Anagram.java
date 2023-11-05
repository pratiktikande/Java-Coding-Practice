package November;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static String checkAnagram(String one, String two) {
        // Convert the input strings into character arrays
        char[] ch1 = one.toCharArray();
        char[] ch2 = two.toCharArray();

        // Sort both character arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Check if the sorted arrays are equal and return "Yes" or "NO"
        return Arrays.equals(ch1, ch2) ? "Yes" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String one = sc.nextLine();
        System.out.println("Enter the second string: ");
        String two = sc.nextLine();
        sc.close();

        String result = checkAnagram(one, two);
        System.out.println("Are the strings anagrams? " + result);
    }
}
