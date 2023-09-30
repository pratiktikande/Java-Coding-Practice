package TCS.Strings;

public class UncommonWords {
    public static void compareAndPrintWords(String str1, String str2) {
        // Split the strings into arrays of words
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");

        // Base case: if one of the strings is empty, check for extra words in the other string
        if (str1.isEmpty() || str2.isEmpty()) {
            if (!str1.isEmpty()) {
                String[] extraWords = str1.split(" ");
                for (String word : extraWords) {
                    System.out.println("Extra word in String 1: " + word);
                }
            } else if (!str2.isEmpty()) {
                String[] extraWords = str2.split(" ");
                for (String word : extraWords) {
                    System.out.println("Extra word in String 2: " + word);
                }
            }
            return;
        }

        // Compare the first words in both strings
        String word1 = words1[0];
        String word2 = words2[0];

        if (!word1.equals(word2)) {
            System.out.println("Differing word:");
            System.out.println("String 1: " + word1);
            System.out.println("String 2: " + word2);
        }

        // Recursively compare the remaining words
        String remaining1 = str1.substring(word1.length()).trim();
        String remaining2 = str2.substring(word2.length()).trim();

        compareAndPrintWords(remaining1, remaining2);
    }

    public static void main(String[] args) {
        String string1 = "This is a test";
        String string2 = "This is another test";

        compareAndPrintWords(string1, string2);
    }
}
