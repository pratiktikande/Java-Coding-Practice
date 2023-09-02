package TCS.Numbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        boolean isPerfect = isPerfectNumber(n);
        
        if (isPerfect) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
        scanner.close();
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false; // Perfect numbers are positive integers greater than 1.
        }
        
        int sum = 1; // Start with 1 as 1 is always a divisor.
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                // If 'i' is a divisor, add 'i' and its corresponding divisor 'num/i'.
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        
        return sum == num; // Check if the sum of divisors equals the number itself.
    }
}
