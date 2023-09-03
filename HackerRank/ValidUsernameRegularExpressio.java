package HackerRank; 

import java.util.Scanner;

class UsernameValidator {
    public static boolean isValid(String username) {
        // Check length constraint
        if (username.length() < 8 || username.length() > 30) {
            return false;
        }

        // Check first character constraint
        char firstChar = username.charAt(0);
        if (!Character.isLetter(firstChar)) {
            return false;
        }

        // Check alphanumeric and underscore constraint
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }

        return true;
    }
}

public class ValidUsernameRegularExpressio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalUsernames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < totalUsernames; i++) {
            String username = scanner.nextLine();
            if (UsernameValidator.isValid(username)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande