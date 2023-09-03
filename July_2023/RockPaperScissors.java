package July_2023;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the user's choice and the computer's choice
        String userChoice;
        String computerChoice;

        // Get the user's choice
        System.out.println("Enter your choice: (rock, paper, scissors)");
        userChoice = scanner.nextLine();

        // Generate the computer's choice randomly
        computerChoice = generateRandomChoice();

        // Display the user's and computer's choices
        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer's choice: " + computerChoice);
        scanner.close();

        // Determine the winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("Tie!");
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("You win!");
        } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    private static String generateRandomChoice() {
        // Create a random number generator
        Random random = new Random();

        // Generate a random number between 0 and 2
        int randomNumber = random.nextInt(3);

        // Return the corresponding choice
        switch (randomNumber) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande