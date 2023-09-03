package DSA.Recursion;

public class FibonacciNumbers {

    public static int calcuFibo(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }
        // Two Recursion function Call
        int fnm1 = calcuFibo(n - 1);
        int fnm2 = calcuFibo(n - 2);
        // Fibonacci Number Formula
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcuFibo(n));
        System.out.println(calcuFibo(23));
        System.out.println(calcuFibo(24));
        System.out.println(calcuFibo(25));
    }
}
  
//www.github.com/pratiktikande
//@Pratik Tikande