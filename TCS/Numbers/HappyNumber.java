package TCS.Numbers;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        } while (slow != fast);

        return slow == 1;
    }
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();
        int n = 19;
        boolean result = solution.isHappy(n);
        System.out.println("Is " + n + " a Happy Number? " + result);
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande