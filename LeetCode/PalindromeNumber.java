package LeetCode; 

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false; // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        }
        
        int reversed = 0;
        int original = x;
        
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        return original == reversed;
    }
    
    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();
        
        int num1 = 121;
        System.out.println(solution.isPalindrome(num1)); // Output: true
        
        int num2 = -121;
        System.out.println(solution.isPalindrome(num2)); // Output: false
        
        int num3 = 10;
        System.out.println(solution.isPalindrome(num3)); // Output: false
    }
}
