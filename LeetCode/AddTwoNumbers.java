package LeetCode;
public class AddTwoNumbers {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        int num = 38; // Change this to the desired input
        int result = solution.addDigits(num);
        
        System.out.println("The digital root of " + num + " is: " + result);
    }
}
