package New_folder;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        // Create a StringBuilder object from the input string
        StringBuilder reversed = new StringBuilder(str);
        // Reverse the string using StringBuilder's reverse() method
        reversed.reverse();
        // Check if the original string is equal to the reversed string
        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String testString1 = "radar";
        String testString2 = "hello";

        // Check if testString1 is a palindrome
        if (isPalindrome(testString1)) {
            System.out.println(testString1 + " is a palindrome.");
        } else {
            System.out.println(testString1 + " is not a palindrome.");
        }

        // Check if testString2 is a palindrome
        if (isPalindrome(testString2)) {
            System.out.println(testString2 + " is a palindrome.");
        } else {
            System.out.println(testString2 + " is not a palindrome.");
        }
    }
}
