package DSA.Recursion;

public class XToThePowerNOptimized {

    public static int OptimizedPower(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursion
        int Halfpower = OptimizedPower(x, n/2);
        int HalfpowerSq = Halfpower * Halfpower;

        // If n Is odd
        if (n % 2 != 0) {
            HalfpowerSq = x * HalfpowerSq;
        }
        return HalfpowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(OptimizedPower(x, n));
    }
}
