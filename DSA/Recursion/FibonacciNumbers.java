package DSA.Recursion;

public class FibonacciNumbers {

    public static int CalcuFibo(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }
        // Two Recursion function Call
        int fnm1 = CalcuFibo(n - 1);
        int fnm2 = CalcuFibo(n - 2);
        // Fibonacci Number Formula
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalcuFibo(n));
        System.out.println(CalcuFibo(23));
        System.out.println(CalcuFibo(24));
        System.out.println(CalcuFibo(25));
    }
}
  