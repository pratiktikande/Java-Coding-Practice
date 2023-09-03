package July_2023;

//Using java.io.BufferedReader and java.io.InputStreamReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputExample1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close(); // Don't forget to close the reader when you're done.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande