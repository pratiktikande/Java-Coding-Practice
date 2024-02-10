package New_folder;

import java.util.Arrays;
import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverseWords(input);

        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }

    private static String reverseWords(String input) {
        return Arrays.stream(input.split("\\s+"))
                .reduce((word1, word2) -> word2 + "." + word1)
                .orElse("");
    }
}
