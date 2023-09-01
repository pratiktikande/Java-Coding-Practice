package TCS.Numbers;

public class Fibonacci {
    public static long findNthFibonacci(int n) {
        if (n <= 0) {
            return -1; // Invalid input, return -1 for error
        }

        if (n == 1 || n == 2) {
            return 1; // The first two Fibonacci numbers are both 1
        }

        long prev = 1;
        long current = 1;

        for (int i = 3; i <= n; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 10; // Change this to the desired Nth Fibonacci number
        long nthFibonacci = findNthFibonacci(n);

        if (nthFibonacci != -1) {
            System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }
}

