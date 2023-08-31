package TCS.Numbers;

public class PrimeNumbers {

    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        if (N <= 3) {
            return true;
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        
        System.out.println(num1 + " is prime: " + isPrime(num1));  // Output: true
        System.out.println(num2 + " is prime: " + isPrime(num2));  // Output: false
    }
}
