package TCS.Numbers;
 public class ClimbStairs {
    public int climbStairs(int n) {
        return climb(0, n);
    }

    private int climb(int currentStep, int n) {
        if (currentStep > n) {
            return 0;
        }
        if (currentStep == n) {
            return 1;
        }
        
        int ways1Step = climb(currentStep + 1, n);
        int ways2Steps = climb(currentStep + 2, n);
        
        return ways1Step + ways2Steps;
    }

    public static void main(String[] args) {
        ClimbStairs solution = new ClimbStairs();
        int n = 4; // Replace with the desired number of steps
        System.out.println("Distinct ways: " + solution.climbStairs(n));
    }
}


//Optimize Solution 

// public class Solution {
//     public int climbStairs(int n) {
//         if (n <= 2) {
//             return n;
//         }
        
//         int prev1 = 1;
//         int prev2 = 2;
        
//         for (int i = 3; i <= n; i++) {
//             int current = prev1 + prev2;
//             prev1 = prev2;
//             prev2 = current;
//         }
        
//         return prev2;
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int n = 4; // Replace with the desired number of steps
//         System.out.println("Distinct ways: " + solution.climbStairs(n));
//     }
// }
