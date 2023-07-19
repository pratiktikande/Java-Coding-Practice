package July_2023;

public class fibonaci {
    public static void main(String[] args) {
        int n = 4; // Specify the value of N here
        long sum = getSumOfFibonacciEvenIndexes(n);
        System.out.println("Sum of Fibonacci series numbers at the first " + n + " even indexes: " + sum);
    }

    public static long getSumOfFibonacciEvenIndexes(int n) {
        if (n <= 0) {
            return 0;
        }

        long sum = 0;
        long prev = 0;
        long current = 1;
        int count = 1;

        while (count <= n) {
            if (current % 2 == 0) {
                sum += current;
                count++;
            }
            long next = prev + current;
            prev = current;
            current = next;
        }

        return sum;
    }
}
