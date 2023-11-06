package November;

public class SumOfDigitsAndSquaresOfDigits {
    public static int sumOfDigitsAndSquaresOfDigits(int n) {
        int sumOfDigits = 0;
        int sumOfSquaresOfDigits = 0;

        while (n > 0) {
            int digit = n % 10;
            sumOfDigits += digit;
            sumOfSquaresOfDigits += digit * digit;
            n /= 10;
        }

        return sumOfDigits + sumOfSquaresOfDigits;
    }

    public static void main(String[] args) {
        int n = 456;

        int sumOfDigitsAndSquaresOfDigits = sumOfDigitsAndSquaresOfDigits(n);

        System.out.println("Sum of digits and squares of digits: " + sumOfDigitsAndSquaresOfDigits);
    }
}
