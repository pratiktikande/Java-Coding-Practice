package July_2023;

public class PrimeNumberDisplay {
    // Java Program to Display All Prime Numbers from 1 to N
    public static void main(String[] args) {
        int N = 100; // Change N to the desired limit

        System.out.println("Prime numbers between 1 and " + N + " are:");

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande