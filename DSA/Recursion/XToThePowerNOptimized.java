package DSA.Recursion;

public class XToThePowerNOptimized {

    public static int optimizedPower(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursion
        int Halfpower = optimizedPower(x, n/2);
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
        System.out.println(optimizedPower(x, n));
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande