package July_2023;

import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        int sequenceLength = 5;
        int stringLength = 8;

        String[] possibleChars = {
            "abcdefghijklmnopqrstuvwxyz",
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
            "0123456789"
        };

        Random random = new Random();

        System.out.println("Random Sequence of Strings:");

        for (int i = 0; i < sequenceLength; i++) {
            StringBuilder randomString = new StringBuilder();
            
            for (int j = 0; j < stringLength; j++) {
                int charSetIndex = random.nextInt(possibleChars.length);
                String charSet = possibleChars[charSetIndex];
                int randomCharIndex = random.nextInt(charSet.length());
                char randomChar = charSet.charAt(randomCharIndex);
                randomString.append(randomChar);
            }
            
            System.out.println(randomString);
        }
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande