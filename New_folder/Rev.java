package New_folder;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversedString = reverseWords(input);
        
        System.out.println("Reversed String: " + reversedString);
        
        scanner.close();
    }

    private static String reverseWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(".");
            }
        }

        return reversed.toString();
    }
}
