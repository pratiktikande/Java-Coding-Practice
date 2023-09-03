package Interview_Prep;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }

            left++;
            right--;
        }

        return true; // If the loop finishes without returning false, it's a palindrome
    }

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panama";
        String str2 = "race a car";
        String str3 = "Madam In Eden, I'm Adam";
        
        System.out.println(str1 + " is a valid palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a valid palindrome: " + isPalindrome(str2));
        System.out.println(str3 + " is a valid palindrome: " + isPalindrome(str3));
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande