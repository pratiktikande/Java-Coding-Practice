package Interview_Prep;

//Palindrome Check: Determine if a given string is a palindrome (reads the same forward and backward)
public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Compare characters at left and right indices
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }

            // Move the pointers towards each other
            left++;
            right--;
        }

        return true; // If the loop finishes without returning false, it's a palindrome
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
    }
}
