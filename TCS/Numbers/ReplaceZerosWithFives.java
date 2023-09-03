package TCS.Numbers;
import java.util.Scanner;

public class ReplaceZerosWithFives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        
        int result = replaceZerosWithFives(input);
        
        System.out.println("Input with 0s replaced by 5s: " + result);
        scanner.close();
    }

    public static int replaceZerosWithFives(int num) {
        // Convert the integer to a string
        String numStr = Integer.toString(num);
        
        // Replace all '0' with '5' in the string
        String replacedStr = numStr.replace('0', '5');
        
        // Convert the modified string back to an integer
        int result = Integer.parseInt(replacedStr);
        
        return result;
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande