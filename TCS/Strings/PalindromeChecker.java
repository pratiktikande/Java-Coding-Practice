package TCS.Strings;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str ="Radon";
        int strLen= str.length();
        String rev="";

        for (int i = (strLen- 1); i >=0; --i) {
            rev = rev + str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
          }
          else {
            System.out.println(str + " is not a Palindrome String.");
          }
    }
}