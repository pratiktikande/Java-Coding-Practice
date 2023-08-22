package HackerRank;

import java.util.Scanner;
import java.util.regex.*;

class MyRegex {
    String pattern;

    MyRegex() {
        // Regular expression pattern for valid IP address
        pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }
}

public class JavaRegex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRegex regex = new MyRegex();

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            boolean isValid = Pattern.matches(regex.pattern, input);
            System.out.println(isValid);
        }

        scanner.close();
    }
}

