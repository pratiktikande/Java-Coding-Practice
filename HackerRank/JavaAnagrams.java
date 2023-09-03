package HackerRank;
import java.util.Scanner;

public class JavaAnagrams {
    public static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Remove non-alphabetic characters
        a = a.replaceAll("[^a-z]", "");
        b = b.replaceAll("[^a-z]", "");

        // If lengths are different, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        int[] charCountA = new int[26];
        int[] charCountB = new int[26];

        // Count character frequencies in string a
        for (char c : a.toCharArray()) {
            charCountA[c - 'a']++;
        }

        // Count character frequencies in string b
        for (char c : b.toCharArray()) {
            charCountB[c - 'a']++;
        }

        // Compare character frequencies
        for (int i = 0; i < 26; i++) {
            if (charCountA[i] != charCountB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        scanner.close();

        if (isAnagram(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande