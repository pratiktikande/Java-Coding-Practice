package July_2023;

//Using java.util.Scanner
import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        scanner.close(); // Don't forget to close the scanner when you're done.
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande
