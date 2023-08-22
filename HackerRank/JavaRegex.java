package HackerRank;

import java.util.Scanner;
//Brute Force Approrach

public class JavaRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            boolean isValid = isIpAddressValid(input);
            System.out.println(isValid);
        }

        scanner.close();
    }

    public static boolean isIpAddressValid(String input) {
        String[] segments = input.split("\\.");

        if (segments.length != 4) {
            return false;
        }

        for (String segment : segments) {
            if (!isValidSegment(segment)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isValidSegment(String segment) {
        if (segment.isEmpty() || segment.length() > 3) {
            return false;
        }

        for (int i = 0; i < segment.length(); i++) {
            if (!Character.isDigit(segment.charAt(i))) {
                return false;
            }
        }

        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
}
