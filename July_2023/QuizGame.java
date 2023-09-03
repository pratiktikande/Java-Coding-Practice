package July_2023;

import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote the play 'Romeo and Juliet'?",
            "What is the largest mammal in the world?",
            "What is the chemical symbol for gold?"
        };

        String[] answers = {
            "Paris",
            "Mars",
            "William Shakespeare",
            "Blue whale",
            "Au"
        };

        int score = 0;

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Answer the following questions:");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }
        }

        System.out.println("\nQuiz finished! Your score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande