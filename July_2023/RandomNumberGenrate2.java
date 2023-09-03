package July_2023;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenrate2 {
    public static void main(String[] args) {
        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber = ThreadLocalRandom.current().nextInt(100);
        System.out.println("Random Number: " + randomNumber);
        
        // Generate a random double between 0 (inclusive) and 1 (exclusive)
        double randomDouble = ThreadLocalRandom.current().nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande
