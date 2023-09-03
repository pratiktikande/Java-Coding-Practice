package Interview_Prep;

public class ReverseInteger {

    //Reverse Integer: Given an integer, reverse its digits (e.g., input: 123, output: 321

    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before adding the next digit
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = reverse(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversedNum);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande
