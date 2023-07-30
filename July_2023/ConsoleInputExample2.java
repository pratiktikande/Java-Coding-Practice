package July_2023;

//Using java.io.Console (available from Java 6 onwards)
public class ConsoleInputExample2 {
    public static void main(String[] args) {
        java.io.Console console = System.console();
        if (console == null) {
            System.out.println("Console is not available.");
            return;
        }
        
        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");
        // Use the password securely

        System.out.println(password);
        System.out.println("Hello, " + name + "! Your password is securely read." );
    }
}


