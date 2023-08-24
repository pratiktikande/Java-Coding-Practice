package Interview_Prep;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Original numbers: a = " + a + ", b = " + b);

        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping using temporary variable: a = " + a + ", b = " + b);

        // Using addition and subtraction
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping using addition and subtraction: a = " + a + ", b = " + b);

        // Using XOR bitwise operation
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping using XOR bitwise operation: a = " + a + ", b = " + b);
    }
}
