import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRange = 100;

        int totalScore = 0;
        int rounds = 0;

        System.out.println(" **WELCOME TO NUMBER GUESSING GAME** ");
        System.out.println("YOU HAVE 10 ATTEMPTS!! GUESS THE CORRECT NUMBER BETWEEN 1 AND " + maxRange + ".");

        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            while (attempts < 10) {
                System.out.print("ATTEMPTS " + (attempts + 1) + " !! PLEASE ENTER YOUR GUESSED NUMBER !! ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("** CONGRATULATIONS ** !!YOU GUESSED THE CORRECT NUMBER!!");
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("OOPS!! PLEASE TRY HIGHER NUMBER");
                } else {
                    System.out.println("OOPS!! PLEASE TRY LOWER NUMBER");
                }

                attempts++;
            }

            if (!hasGuessedCorrectly) {
                System.out.println("SORRY:( YOU HAVE RUN OUT OF THE ATTEMPTS!! The correct number was-> " + targetNumber);
            } else {
                int roundScore = 10 - attempts;
                totalScore += roundScore;
                System.out.println("Round Score: " + roundScore);
            }

            rounds++;

            System.out.print("DO YOU WANT TO PLAY ANOTHER ROUND? (yes/no): ");
            String playAgainInput = scanner.next();
            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("**GAME OVER**");
        System.out.println("Total Rounds Played: " + rounds);
        System.out.println("Total Score: " + totalScore);

        scanner.close();
    }
}