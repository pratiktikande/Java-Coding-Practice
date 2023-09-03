package July_2023;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber = random.nextInt(100);
        System.out.println("Random Number: " + randomNumber);
        
        // Generate a random double between 0 (inclusive) and 1 (exclusive)
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande