package LeetCode;

public class ClimbSrairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        int prev1 = 1;
        int prev2 = 2;
        
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        
        return prev2;
    }

    public static void main(String[] args) {
        ClimbSrairs solution = new ClimbSrairs();
        int n = 4; // Replace with the desired number of steps
        System.out.println("Distinct ways: " + solution.climbStairs(n));
    }
}
