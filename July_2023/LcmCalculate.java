package July_2023;
public class LcmCalculate {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int findLCM(int num1, int num2) {
        int lcm = Math.max(num1, num2); // Start with the larger number

        for (int i = lcm; ; i += lcm) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i; // Update lcm with the found value
                break; // LCM found
            }
        }
        return lcm;
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande