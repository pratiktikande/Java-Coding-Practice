package Classes_and_Object_Programs;

public class MethodOverloadingExample {

    // Method with one integer parameter
    public void printNumber(int num) {
        System.out.println("Integer: " + num);
    }

    // Method with one double parameter
    public void printNumber(double num) {
        System.out.println("Double: " + num);
    }

    // Method with two integer parameters
    public void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        example.printNumber(10);       // Calls the first printNumber method
        example.printNumber(3.14);     // Calls the second printNumber method

        example.printSum(5, 7);        // Calls the printSum method
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande