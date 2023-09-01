package LeetCode;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;
        
        long left = 2; // Start with 2 as the smallest valid perfect square is 1.
        long right = num / 2;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}
