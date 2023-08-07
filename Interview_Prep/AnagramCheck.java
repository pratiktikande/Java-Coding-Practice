package Interview_Prep;

import java.util.Arrays;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove white spaces and convert the strings to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the lengths of the strings are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";
        String str4 = "world";

        System.out.println(str1 + " and " + str2 + " are anagrams: " + areAnagrams(str1, str2));
        System.out.println(str1 + " and " + str3 + " are anagrams: " + areAnagrams(str1, str3));
        System.out.println(str1 + " and " + str4 + " are anagrams: " + areAnagrams(str1, str4));
    }
}

